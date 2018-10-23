package net.stickycode.prybar.pivot;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import net.stickycode.prybar.discovery.PrybarDefinitionRegistry;

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

  public void wire(PrybarDefinitionRegistry registry) {
    for (Wiring w : wirings) {
      w.wire(registry);
    }
  }

  public Type getType() {
    return value.getClass();
  }
}
