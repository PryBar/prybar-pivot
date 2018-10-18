package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent137
    implements PrybarComponent {

  private RootComponent137 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent137.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent137.class, "root"));
  }

  public RootComponent137 getRoot() {
    return root;
  }

}
