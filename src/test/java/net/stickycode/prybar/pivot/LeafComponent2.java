package net.stickycode.prybar.pivot;

public class LeafComponent2
    implements PrybarComponent {

  private RootComponent root;

  private LeafComponent leaf;

  @Override
  public void wire(PrybarRuntime prybar) {
    this.root = prybar.require(new PrybarComponentLookup(this, RootComponent.class, "root"));
    this.leaf = prybar.require(new PrybarComponentLookup(this, LeafComponent.class, "leaf"));
  }

  public RootComponent getRoot() {
    return root;
  }

}
