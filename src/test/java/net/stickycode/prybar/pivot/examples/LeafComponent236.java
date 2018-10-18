package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent236
    implements PrybarComponent {

  private RootComponent236 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent236.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent236.class, "root"));
  }

  public RootComponent236 getRoot() {
    return root;
  }

}
