package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent924
    implements PrybarComponent {

  private RootComponent924 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent924.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent924.class, "root"));
  }

  public RootComponent924 getRoot() {
    return root;
  }

}
