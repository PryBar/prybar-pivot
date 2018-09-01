package net.stickycode.prybar.pivot;

@FunctionalInterface
public interface Wiring {
  
  void wire(ComponentRegistry beans);

}
