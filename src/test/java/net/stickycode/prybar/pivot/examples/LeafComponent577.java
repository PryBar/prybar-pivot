package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent577
    implements PrybarComponent {

  private RootComponent577 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent577.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent577.class, "root"));
  }

  public RootComponent577 getRoot() {
    return root;
  }

}
