package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent55
    implements PrybarComponent {

  private RootComponent55 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent55.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent55.class, "root"));
  }

  public RootComponent55 getRoot() {
    return root;
  }

}
