package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent402
    implements PrybarComponent {

  private RootComponent402 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent402.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent402.class, "root"));
  }

  public RootComponent402 getRoot() {
    return root;
  }

}
