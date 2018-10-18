package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent387
    implements PrybarComponent {

  private RootComponent387 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent387.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent387.class, "root"));
  }

  public RootComponent387 getRoot() {
    return root;
  }

}
