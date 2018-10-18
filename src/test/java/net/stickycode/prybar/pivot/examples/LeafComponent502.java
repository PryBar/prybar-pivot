package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent502
    implements PrybarComponent {

  private RootComponent502 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent502.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent502.class, "root"));
  }

  public RootComponent502 getRoot() {
    return root;
  }

}
