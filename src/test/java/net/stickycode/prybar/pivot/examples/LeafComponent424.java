package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent424
    implements PrybarComponent {

  private RootComponent424 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent424.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent424.class, "root"));
  }

  public RootComponent424 getRoot() {
    return root;
  }

}
