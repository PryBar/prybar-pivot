package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent963
    implements PrybarComponent {

  private RootComponent963 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent963.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent963.class, "root"));
  }

  public RootComponent963 getRoot() {
    return root;
  }

}
