package net.stickycode.prybar.pivot;

public class LeafComponent {

  {
    Component<LeafComponent> bean = new Component<>(this);
    bean.addWiring(new Wiring() {

      @Override
      public void wire(ComponentRegistry components) {
        root = components.find(RootComponent.class);
        assert root != null;
      }
      
    });
    Prybar.register(bean);
  }

  private RootComponent root;

}
