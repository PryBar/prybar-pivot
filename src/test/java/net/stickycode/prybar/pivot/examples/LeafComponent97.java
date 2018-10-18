package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent97
    implements PrybarComponent {

  private RootComponent97 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent97.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent97.class, "root"));
  }

  public RootComponent97 getRoot() {
    return root;
  }

}
