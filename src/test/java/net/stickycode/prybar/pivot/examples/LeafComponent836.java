package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent836
    implements PrybarComponent {

  private RootComponent836 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent836.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent836.class, "root"));
  }

  public RootComponent836 getRoot() {
    return root;
  }

}
