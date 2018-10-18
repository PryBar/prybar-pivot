package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent494
    implements PrybarComponent {

  private RootComponent494 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent494.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent494.class, "root"));
  }

  public RootComponent494 getRoot() {
    return root;
  }

}
