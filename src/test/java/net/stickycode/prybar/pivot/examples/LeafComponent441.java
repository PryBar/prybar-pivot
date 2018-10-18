package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent441
    implements PrybarComponent {

  private RootComponent441 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent441.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent441.class, "root"));
  }

  public RootComponent441 getRoot() {
    return root;
  }

}
