package net.stickycode.prybar.pivot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrybarPivot {

  private Map<Class<?>, PrybarComponent> components = new HashMap<>();

  private List<PrybarMessage> failures = new ArrayList<>();

  public <T> T find(Class<T> type) {
    return (T) components.get(type);
  }

  public void register(PrybarComponent i) {
    this.components.put(i.getClass(), i);
  }

  public void failure(PrybarMessage e) {
    failures.add(e);
  }

  public void wire() {
    components.values().parallelStream().forEach(c -> c.wire(this));
  }

  public <T> T require(PrybarComponentLookup lookup) {
    if (components.containsKey(lookup.getType()))
      return (T) components.get(lookup.getType());

    failures.add(lookup);
    return null;
  }

}
