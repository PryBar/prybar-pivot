package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent457
    implements PrybarComponent {

  private RootComponent457 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent457.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent457.class, "root"));
  }

  public RootComponent457 getRoot() {
    return root;
  }

}
