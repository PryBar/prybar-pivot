package net.stickycode.prybar.pivot;

public class LeafComponent
    implements PrybarComponent {

  private RootComponent root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.require(new PrybarComponentLookup(this, RootComponent.class, "root"));
  }

  public RootComponent getRoot() {
    return root;
  }

}
