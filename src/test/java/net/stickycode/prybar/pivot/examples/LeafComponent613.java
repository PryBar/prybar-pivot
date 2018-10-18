package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent613
    implements PrybarComponent {

  private RootComponent613 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent613.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent613.class, "root"));
  }

  public RootComponent613 getRoot() {
    return root;
  }

}
