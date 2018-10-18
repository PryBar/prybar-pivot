package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent74
    implements PrybarComponent {

  private RootComponent74 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent74.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent74.class, "root"));
  }

  public RootComponent74 getRoot() {
    return root;
  }

}
