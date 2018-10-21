package net.stickycode.prybar.pivot;

public class LeafComponent
    implements PrybarComponent {

  private RootComponent root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.require(new PrybarComponentLookup(this, RootComponent.class, "root"));
  }

  public RootComponent getRoot() {
    return root;
  }

}
