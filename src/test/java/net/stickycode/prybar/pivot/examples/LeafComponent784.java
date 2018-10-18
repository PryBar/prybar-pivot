package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent784
    implements PrybarComponent {

  private RootComponent784 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent784.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent784.class, "root"));
  }

  public RootComponent784 getRoot() {
    return root;
  }

}
