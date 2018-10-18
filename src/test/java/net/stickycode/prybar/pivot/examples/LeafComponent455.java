package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent455
    implements PrybarComponent {

  private RootComponent455 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent455.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent455.class, "root"));
  }

  public RootComponent455 getRoot() {
    return root;
  }

}
