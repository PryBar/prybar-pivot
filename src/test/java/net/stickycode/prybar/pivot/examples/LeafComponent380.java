package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent380
    implements PrybarComponent {

  private RootComponent380 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent380.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent380.class, "root"));
  }

  public RootComponent380 getRoot() {
    return root;
  }

}
