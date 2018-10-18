package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent498
    implements PrybarComponent {

  private RootComponent498 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent498.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent498.class, "root"));
  }

  public RootComponent498 getRoot() {
    return root;
  }

}
