package net.stickycode.prybar.pivot;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class SingletonScope
    implements ComponentScope {

  private List<Class<?>> types = new ArrayList<>();

  public void add(Class<?> type) {
    this.types.add(type);
  }

  @Override
  public void initialise(PrybarPivot pivot) {
    types.parallelStream().forEach(c -> initialise(c, pivot));
  }

  private void initialise(Class<?> c, PrybarPivot pivot) {
    try {
      pivot.register((PrybarComponent) c.getDeclaredConstructor(null).newInstance(null));
    }
    catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
      | NoSuchMethodException | SecurityException e) {
      pivot.failure(new ComponentFailureMessage(e.getMessage()));
    }
  }

}
