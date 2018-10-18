package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent671
    implements PrybarComponent {

  private RootComponent671 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent671.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent671.class, "root"));
  }

  public RootComponent671 getRoot() {
    return root;
  }

}
