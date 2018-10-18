package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent113
    implements PrybarComponent {

  private RootComponent113 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent113.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent113.class, "root"));
  }

  public RootComponent113 getRoot() {
    return root;
  }

}
