package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent156
    implements PrybarComponent {

  private RootComponent156 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent156.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent156.class, "root"));
  }

  public RootComponent156 getRoot() {
    return root;
  }

}
