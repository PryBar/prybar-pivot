package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent243
    implements PrybarComponent {

  private RootComponent243 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent243.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent243.class, "root"));
  }

  public RootComponent243 getRoot() {
    return root;
  }

}
