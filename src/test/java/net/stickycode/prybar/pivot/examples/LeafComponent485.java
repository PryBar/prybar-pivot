package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent485
    implements PrybarComponent {

  private RootComponent485 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent485.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent485.class, "root"));
  }

  public RootComponent485 getRoot() {
    return root;
  }

}
