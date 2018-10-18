package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent652
    implements PrybarComponent {

  private RootComponent652 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent652.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent652.class, "root"));
  }

  public RootComponent652 getRoot() {
    return root;
  }

}
