package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent57
    implements PrybarComponent {

  private RootComponent57 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent57.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent57.class, "root"));
  }

  public RootComponent57 getRoot() {
    return root;
  }

}
