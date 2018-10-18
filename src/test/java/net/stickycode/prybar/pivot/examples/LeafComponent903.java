package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent903
    implements PrybarComponent {

  private RootComponent903 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent903.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent903.class, "root"));
  }

  public RootComponent903 getRoot() {
    return root;
  }

}
