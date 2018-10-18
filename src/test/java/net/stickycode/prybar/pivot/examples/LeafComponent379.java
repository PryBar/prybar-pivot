package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent379
    implements PrybarComponent {

  private RootComponent379 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent379.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent379.class, "root"));
  }

  public RootComponent379 getRoot() {
    return root;
  }

}
