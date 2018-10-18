package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent150
    implements PrybarComponent {

  private RootComponent150 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent150.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent150.class, "root"));
  }

  public RootComponent150 getRoot() {
    return root;
  }

}
