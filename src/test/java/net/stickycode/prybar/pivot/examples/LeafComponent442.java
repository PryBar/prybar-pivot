package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent442
    implements PrybarComponent {

  private RootComponent442 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent442.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent442.class, "root"));
  }

  public RootComponent442 getRoot() {
    return root;
  }

}
