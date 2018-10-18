package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent554
    implements PrybarComponent {

  private RootComponent554 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent554.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent554.class, "root"));
  }

  public RootComponent554 getRoot() {
    return root;
  }

}
