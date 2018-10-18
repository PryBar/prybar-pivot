package net.stickycode.prybar.pivot;

import static org.assertj.core.api.StrictAssertions.assertThat;

import java.io.IOException;

import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.RunnerException;

public class PrybarPivotTest {

  @Test
  public void pivot() {
    Prybar prybar = new Prybar();
    SingletonScope scope = new SingletonScope();
    scope.add(LeafComponent.class);
    scope.add(RootComponent.class);
    prybar.addScope(scope);
    PrybarPivot pivot = prybar.pivot();

    assertThat(pivot.find(LeafComponent.class)).isNotNull();
    assertThat(pivot.find(LeafComponent.class).getRoot()).isNotNull();
  }

  @Benchmark
  @BenchmarkMode(Mode.SingleShotTime)
  public void proof() {
    pivot();
  }

  @Test
  public void benchmark() throws RunnerException, IOException {
    org.openjdk.jmh.Main.main(new String[0]);
  }

  @Test
  public void genasm() throws IOException {
    org.objectweb.asm.util.ASMifier
      .main(new String[] { "target-eclipse/test-classes/net/stickycode/prybar/pivot/examples/LeafComponent1.class" });
  }

}
