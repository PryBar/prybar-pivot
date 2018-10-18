package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent235
    implements PrybarComponent {

  private RootComponent235 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent235.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent235.class, "root"));
  }

  public RootComponent235 getRoot() {
    return root;
  }

}
