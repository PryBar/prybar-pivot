package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent847
    implements PrybarComponent {

  private RootComponent847 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent847.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent847.class, "root"));
  }

  public RootComponent847 getRoot() {
    return root;
  }

}
