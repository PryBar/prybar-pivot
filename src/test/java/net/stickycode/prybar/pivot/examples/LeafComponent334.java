package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent334
    implements PrybarComponent {

  private RootComponent334 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent334.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent334.class, "root"));
  }

  public RootComponent334 getRoot() {
    return root;
  }

}
