package net.stickycode.prybar.pivot;

public class Prybar {

  private static Prybar CONTEXT = new Prybar();

  public static void register(Component<?> bean) {
    CONTEXT.add(bean);
  }

  private ComponentRegistry registry = new ComponentRegistry();

  private void add(Component<?> bean) {
    registry.register(bean);
  }

  public static void pivot() {
    CONTEXT.wire();
  }

  private void wire() {
    for (Component<?> c : registry) {
      c.wire(registry);
    }
  }

}
