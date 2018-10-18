package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent204
    implements PrybarComponent {

  private RootComponent204 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent204.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent204.class, "root"));
  }

  public RootComponent204 getRoot() {
    return root;
  }

}
