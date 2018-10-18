package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent420
    implements PrybarComponent {

  private RootComponent420 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent420.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent420.class, "root"));
  }

  public RootComponent420 getRoot() {
    return root;
  }

}
