package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent659
    implements PrybarComponent {

  private RootComponent659 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent659.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent659.class, "root"));
  }

  public RootComponent659 getRoot() {
    return root;
  }

}
