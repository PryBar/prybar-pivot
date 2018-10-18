package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent64
    implements PrybarComponent {

  private RootComponent64 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent64.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent64.class, "root"));
  }

  public RootComponent64 getRoot() {
    return root;
  }

}
