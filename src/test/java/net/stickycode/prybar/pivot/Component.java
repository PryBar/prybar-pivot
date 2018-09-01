package net.stickycode.prybar.pivot;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Component<T> {

  private T value;

  private List<Wiring> wirings = new ArrayList<>();

  public Component(T value) {
    this.value = value;
  }

  public void addWiring(Wiring wiring) {
    this.wirings.add(wiring);
  }

  public Object getValue() {
    return value;
  }

  public void wire(ComponentRegistry registry) {
    for (Wiring w : wirings) {
      w.wire(registry);
    }
  }

  public Type getType() {
    return value.getClass();
  }
}
