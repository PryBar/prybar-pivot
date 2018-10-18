package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent509
    implements PrybarComponent {

  private RootComponent509 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent509.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent509.class, "root"));
  }

  public RootComponent509 getRoot() {
    return root;
  }

}
