package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent90
    implements PrybarComponent {

  private RootComponent90 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent90.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent90.class, "root"));
  }

  public RootComponent90 getRoot() {
    return root;
  }

}
