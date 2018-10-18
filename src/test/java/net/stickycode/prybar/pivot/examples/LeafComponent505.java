package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent505
    implements PrybarComponent {

  private RootComponent505 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent505.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent505.class, "root"));
  }

  public RootComponent505 getRoot() {
    return root;
  }

}
