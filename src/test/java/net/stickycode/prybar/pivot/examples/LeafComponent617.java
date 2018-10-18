package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent617
    implements PrybarComponent {

  private RootComponent617 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent617.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent617.class, "root"));
  }

  public RootComponent617 getRoot() {
    return root;
  }

}
