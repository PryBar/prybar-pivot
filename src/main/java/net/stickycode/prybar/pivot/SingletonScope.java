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
    for (Class<?> c : types) {
      try {
        pivot.register((PrybarComponent) c.getDeclaredConstructor(null).newInstance(null));
      }
      catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
        | NoSuchMethodException | SecurityException e) {
        pivot.failure(new ComponentFailureMessage(e.getMessage()));
      }
    }
  }

}
