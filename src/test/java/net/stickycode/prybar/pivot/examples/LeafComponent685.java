package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent685
    implements PrybarComponent {

  private RootComponent685 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent685.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent685.class, "root"));
  }

  public RootComponent685 getRoot() {
    return root;
  }

}
