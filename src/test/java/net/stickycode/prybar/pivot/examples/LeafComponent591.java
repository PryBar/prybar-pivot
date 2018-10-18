package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent591
    implements PrybarComponent {

  private RootComponent591 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent591.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent591.class, "root"));
  }

  public RootComponent591 getRoot() {
    return root;
  }

}
