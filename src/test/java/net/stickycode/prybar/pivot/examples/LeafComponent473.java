package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent473
    implements PrybarComponent {

  private RootComponent473 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent473.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent473.class, "root"));
  }

  public RootComponent473 getRoot() {
    return root;
  }

}
