package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent439
    implements PrybarComponent {

  private RootComponent439 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent439.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent439.class, "root"));
  }

  public RootComponent439 getRoot() {
    return root;
  }

}
