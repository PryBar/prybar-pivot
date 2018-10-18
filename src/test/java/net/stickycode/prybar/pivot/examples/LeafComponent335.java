package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent335
    implements PrybarComponent {

  private RootComponent335 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent335.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent335.class, "root"));
  }

  public RootComponent335 getRoot() {
    return root;
  }

}
