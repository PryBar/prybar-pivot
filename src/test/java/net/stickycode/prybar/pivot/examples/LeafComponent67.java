package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent67
    implements PrybarComponent {

  private RootComponent67 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent67.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent67.class, "root"));
  }

  public RootComponent67 getRoot() {
    return root;
  }

}
