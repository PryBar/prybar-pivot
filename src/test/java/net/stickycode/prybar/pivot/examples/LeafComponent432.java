package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent432
    implements PrybarComponent {

  private RootComponent432 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent432.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent432.class, "root"));
  }

  public RootComponent432 getRoot() {
    return root;
  }

}
