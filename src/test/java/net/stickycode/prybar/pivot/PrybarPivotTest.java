package net.stickycode.prybar.pivot;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrybarPivotTest {

  @Test
  public void pivot()
      throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException,
      IllegalArgumentException, InvocationTargetException, IOException {
    List<String> components = Arrays.asList(LeafComponent.class.getName());

    // components.parallelStream()
    // .map(name -> new ComponentDefinition(name))
    // .
    //
    Class<?> o = Class.forName(LeafComponent.class.getName());
    ByteArrayOutputStream store = new ByteArrayOutputStream();
    ObjectOutputStream out = new ObjectOutputStream(store);
    out.writeObject(o);
    ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(store.toByteArray()));
    Class<?> c = (Class<?>) in.readObject();
    Constructor<?> constructor = c.getConstructor(null);
    LeafComponent l = (LeafComponent) constructor.newInstance(null);
  }

}
