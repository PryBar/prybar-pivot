package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent215
    implements PrybarComponent {

  private RootComponent215 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent215.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent215.class, "root"));
  }

  public RootComponent215 getRoot() {
    return root;
  }

}
