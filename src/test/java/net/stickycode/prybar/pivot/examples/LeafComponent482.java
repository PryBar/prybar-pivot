package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent482
    implements PrybarComponent {

  private RootComponent482 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent482.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent482.class, "root"));
  }

  public RootComponent482 getRoot() {
    return root;
  }

}
