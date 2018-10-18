package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent701
    implements PrybarComponent {

  private RootComponent701 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent701.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent701.class, "root"));
  }

  public RootComponent701 getRoot() {
    return root;
  }

}
