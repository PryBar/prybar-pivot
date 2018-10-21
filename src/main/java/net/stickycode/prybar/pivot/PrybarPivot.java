package net.stickycode.prybar.pivot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PrybarPivot
    implements PrybarRuntime {

  private Map<Class<?>, PrybarComponent> components = new ConcurrentHashMap<>();

  private List<PrybarMessage> failures = new ArrayList<>();

  @Override
  public <T> T find(Class<T> type) {
    return (T) components.get(type);
  }

  @Override
  public void register(PrybarComponent i) {
    this.components.put(i.getClass(), i);
  }

  @Override
  public void failure(PrybarMessage e) {
    failures.add(e);
  }

  @Override
  public void wire() {
    components.values().parallelStream().forEach(c -> c.wire(this));
  }

  @Override
  public <T> T require(PrybarComponentLookup lookup) {
    if (components.containsKey(lookup.getType()))
      return (T) components.get(lookup.getType());

    failures.add(lookup);
    return null;
  }

  @Override
  public boolean hasFailures() {
    return !failures.isEmpty();
  }

  @Override
  public String toString() {
    if (hasFailures())
      return failures.toString();

    return components.toString();
  }

}
