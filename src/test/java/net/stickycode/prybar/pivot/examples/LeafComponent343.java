package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent343
    implements PrybarComponent {

  private RootComponent343 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent343.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent343.class, "root"));
  }

  public RootComponent343 getRoot() {
    return root;
  }

}
