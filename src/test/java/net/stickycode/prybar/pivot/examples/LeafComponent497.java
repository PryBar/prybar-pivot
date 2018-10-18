package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent497
    implements PrybarComponent {

  private RootComponent497 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent497.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent497.class, "root"));
  }

  public RootComponent497 getRoot() {
    return root;
  }

}
