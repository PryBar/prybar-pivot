package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent358
    implements PrybarComponent {

  private RootComponent358 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent358.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent358.class, "root"));
  }

  public RootComponent358 getRoot() {
    return root;
  }

}
