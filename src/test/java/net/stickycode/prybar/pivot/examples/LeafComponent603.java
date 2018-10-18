package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent603
    implements PrybarComponent {

  private RootComponent603 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent603.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent603.class, "root"));
  }

  public RootComponent603 getRoot() {
    return root;
  }

}
