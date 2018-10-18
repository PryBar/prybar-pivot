package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent560
    implements PrybarComponent {

  private RootComponent560 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent560.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent560.class, "root"));
  }

  public RootComponent560 getRoot() {
    return root;
  }

}
