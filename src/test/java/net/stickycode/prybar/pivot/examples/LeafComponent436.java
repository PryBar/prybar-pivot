package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent436
    implements PrybarComponent {

  private RootComponent436 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent436.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent436.class, "root"));
  }

  public RootComponent436 getRoot() {
    return root;
  }

}
