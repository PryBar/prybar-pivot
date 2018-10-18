package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent389
    implements PrybarComponent {

  private RootComponent389 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent389.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent389.class, "root"));
  }

  public RootComponent389 getRoot() {
    return root;
  }

}
