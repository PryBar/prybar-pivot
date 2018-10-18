package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent514
    implements PrybarComponent {

  private RootComponent514 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent514.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent514.class, "root"));
  }

  public RootComponent514 getRoot() {
    return root;
  }

}
