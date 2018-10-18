package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent488
    implements PrybarComponent {

  private RootComponent488 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent488.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent488.class, "root"));
  }

  public RootComponent488 getRoot() {
    return root;
  }

}
