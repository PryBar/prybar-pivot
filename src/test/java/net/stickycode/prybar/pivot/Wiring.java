package net.stickycode.prybar.pivot;

import net.stickycode.prybar.discovery.PrybarDefinitionRegistry;

@FunctionalInterface
public interface Wiring {
  
  void wire(PrybarDefinitionRegistry beans);

}
