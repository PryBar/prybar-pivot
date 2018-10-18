package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent414
    implements PrybarComponent {

  private RootComponent414 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent414.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent414.class, "root"));
  }

  public RootComponent414 getRoot() {
    return root;
  }

}
