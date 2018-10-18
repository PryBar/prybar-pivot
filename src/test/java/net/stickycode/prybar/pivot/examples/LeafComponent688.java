package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent688
    implements PrybarComponent {

  private RootComponent688 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent688.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent688.class, "root"));
  }

  public RootComponent688 getRoot() {
    return root;
  }

}
