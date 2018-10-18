package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent128
    implements PrybarComponent {

  private RootComponent128 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent128.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent128.class, "root"));
  }

  public RootComponent128 getRoot() {
    return root;
  }

}
