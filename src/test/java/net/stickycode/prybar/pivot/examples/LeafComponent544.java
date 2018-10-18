package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent544
    implements PrybarComponent {

  private RootComponent544 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent544.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent544.class, "root"));
  }

  public RootComponent544 getRoot() {
    return root;
  }

}
