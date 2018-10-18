package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent695
    implements PrybarComponent {

  private RootComponent695 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent695.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent695.class, "root"));
  }

  public RootComponent695 getRoot() {
    return root;
  }

}
