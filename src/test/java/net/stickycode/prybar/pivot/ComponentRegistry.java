package net.stickycode.prybar.pivot;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ComponentRegistry
    implements Iterable<Component<?>> {

  private Logger log = LoggerFactory.getLogger(getClass());

  private Map<Class<?>, Component<?>> components = new HashMap<>();

  public <T> T find(Class<T> type) {
    log.info("looking up {}", type);
    return (T) components.get(type).getValue();
  }

  public void register(Component bean) {
    log.info("register {}", bean.getType());
    components.put(bean.getClass(), bean);
  }

  @Override
  public Iterator<Component<?>> iterator() {
    return components.values().iterator();
  }

}
