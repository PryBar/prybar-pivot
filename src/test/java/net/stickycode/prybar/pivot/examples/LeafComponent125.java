package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent125
    implements PrybarComponent {

  private RootComponent125 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent125.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent125.class, "root"));
  }

  public RootComponent125 getRoot() {
    return root;
  }

}
