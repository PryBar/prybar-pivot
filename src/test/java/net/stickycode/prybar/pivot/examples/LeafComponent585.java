package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent585
    implements PrybarComponent {

  private RootComponent585 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent585.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent585.class, "root"));
  }

  public RootComponent585 getRoot() {
    return root;
  }

}
