package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent475
    implements PrybarComponent {

  private RootComponent475 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent475.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent475.class, "root"));
  }

  public RootComponent475 getRoot() {
    return root;
  }

}
