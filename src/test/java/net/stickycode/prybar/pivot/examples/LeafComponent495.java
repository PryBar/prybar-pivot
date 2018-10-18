package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent495
    implements PrybarComponent {

  private RootComponent495 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent495.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent495.class, "root"));
  }

  public RootComponent495 getRoot() {
    return root;
  }

}
