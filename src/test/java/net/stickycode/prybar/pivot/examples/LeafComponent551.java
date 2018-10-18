package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent551
    implements PrybarComponent {

  private RootComponent551 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent551.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent551.class, "root"));
  }

  public RootComponent551 getRoot() {
    return root;
  }

}
