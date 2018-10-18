package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent663
    implements PrybarComponent {

  private RootComponent663 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent663.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent663.class, "root"));
  }

  public RootComponent663 getRoot() {
    return root;
  }

}
