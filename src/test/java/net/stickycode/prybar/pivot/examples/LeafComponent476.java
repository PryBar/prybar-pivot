package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent476
    implements PrybarComponent {

  private RootComponent476 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent476.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent476.class, "root"));
  }

  public RootComponent476 getRoot() {
    return root;
  }

}
