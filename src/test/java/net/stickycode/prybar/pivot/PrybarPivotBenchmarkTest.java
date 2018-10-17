package net.stickycode.prybar.pivot;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.RunnerException;

public class PrybarPivotBenchmarkTest {

  public class Loader
      implements Runnable {

    private Deque<Object> components;

    private Class type;

    public Loader(Deque<Object> components, Object readObject) {
      this.components = components;
      this.type = (Class) readObject;
    }

    @Override
    public void run() {
      components.add(create());
    }

    private Object create() {
      try {
        return type.getConstructor(null).newInstance(null);
      }
      catch (NoSuchMethodException | SecurityException e) {
        throw new RuntimeException(e);
      }
      catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
        throw new RuntimeException(e);
      }
    }

  }

  @Benchmark
  @BenchmarkMode(Mode.SingleShotTime)
  public void parallel() throws FileNotFoundException, IOException, ClassNotFoundException, InterruptedException {
    Deque<Object> components = new ConcurrentLinkedDeque<>();
    ExecutorService runner = Executors.newFixedThreadPool(8);
    try (ObjectInputStream in = new ObjectInputStream(
      new BufferedInputStream(new FileInputStream("src/test/resources/components.classes")));) {
      for (int i = 0; i < 2994; i++)
        runner.execute(new Loader(components, in.readObject()));
    }
    runner.shutdown();
    if (!runner.awaitTermination(10, TimeUnit.SECONDS))
      runner.shutdownNow();

    // System.out.println("parallel " + components.size());

  }

  @Benchmark
  @BenchmarkMode(Mode.SingleShotTime)
  public void serial()
      throws FileNotFoundException, IOException, ClassNotFoundException, InterruptedException, InstantiationException,
      IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
    Deque<Object> components = new ConcurrentLinkedDeque<>();
    try (ObjectInputStream in = new ObjectInputStream(
      new BufferedInputStream(new FileInputStream("src/test/resources/components.classes")));) {
      for (int i = 0; i < 2994; i++)
        components.add(((Class) in.readObject()).getConstructor(null).newInstance(null));
    }

    // System.out.println("serial " + components.size());

  }

  @Benchmark
  @BenchmarkMode(Mode.SingleShotTime)
  public void straight() {
    System.out.println("straight " + loadStraight().size());
  }

  @Benchmark
  @BenchmarkMode(Mode.SingleShotTime)
  public void straightLinear() {
    System.out.println("straight " + loadStraightLinear().size());
  }

  private List<Object> loadStraight() {
    try (Stream<String> stream = Files.lines(Paths.get("src/test/resources/components.list"))) {
      return stream
        .parallel()
        .map(s -> {
          try {
            return Class.forName(s);
          }
          catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
          }
        })
        .map(t -> {
          try {
            return t.getConstructor(null);
          }
          catch (NoSuchMethodException | SecurityException e) {
            throw new RuntimeException(e);
          }
        })
        .map(c -> {
          try {
            return c.newInstance(null);
          }
          catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new RuntimeException(e);
          }
        })
        .collect(Collectors.toList());

    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private List<Object> loadStraightLinear() {
    try (Stream<String> stream = Files.lines(Paths.get("src/test/resources/components.list"))) {
      return stream
        .map(s -> {
          try {
            return Class.forName(s);
          }
          catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
          }
        })
        .map(t -> {
          try {
            return t.getConstructor(null);
          }
          catch (NoSuchMethodException | SecurityException e) {
            throw new RuntimeException(e);
          }
        })
        .map(c -> {
          try {
            return c.newInstance(null);
          }
          catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new RuntimeException(e);
          }
        })
        .collect(Collectors.toList());

    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Test
  public void benchy() throws RunnerException, IOException {
    serialiseComponentClasses();
    org.openjdk.jmh.Main.main(new String[0]);
  }

  private void serialiseComponentClasses() throws FileNotFoundException, IOException {
    try (ObjectOutputStream out = new ObjectOutputStream(
      new BufferedOutputStream(new FileOutputStream("src/test/resources/components.classes")));) {
      try (Stream<String> stream = Files.lines(Paths.get("src/test/resources/components.list"))) {
        stream
          .map(s -> {
            try {
              return Class.forName(s);
            }
            catch (ClassNotFoundException e) {
              throw new RuntimeException(e);
            }
          })
          .forEach(t -> {
            try {
              System.out.println("creating " + t.getSimpleName());
              out.writeObject(t);
            }
            catch (IOException e) {
              throw new RuntimeException(e);
            }
          });
      }
    }

  }
}
