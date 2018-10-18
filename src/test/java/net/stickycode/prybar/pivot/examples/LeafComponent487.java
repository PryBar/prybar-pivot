package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent487
    implements PrybarComponent {

  private RootComponent487 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent487.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent487.class, "root"));
  }

  public RootComponent487 getRoot() {
    return root;
  }

}
