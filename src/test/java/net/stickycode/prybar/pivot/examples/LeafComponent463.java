package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent463
    implements PrybarComponent {

  private RootComponent463 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent463.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent463.class, "root"));
  }

  public RootComponent463 getRoot() {
    return root;
  }

}
