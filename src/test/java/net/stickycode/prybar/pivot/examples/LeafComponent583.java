package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent583
    implements PrybarComponent {

  private RootComponent583 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent583.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent583.class, "root"));
  }

  public RootComponent583 getRoot() {
    return root;
  }

}
