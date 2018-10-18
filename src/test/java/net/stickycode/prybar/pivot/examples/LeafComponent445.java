package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent445
    implements PrybarComponent {

  private RootComponent445 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent445.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent445.class, "root"));
  }

  public RootComponent445 getRoot() {
    return root;
  }

}
