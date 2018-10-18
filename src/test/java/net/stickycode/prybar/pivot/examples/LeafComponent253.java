package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent253
    implements PrybarComponent {

  private RootComponent253 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent253.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent253.class, "root"));
  }

  public RootComponent253 getRoot() {
    return root;
  }

}
