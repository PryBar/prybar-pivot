package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent876
    implements PrybarComponent {

  private RootComponent876 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent876.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent876.class, "root"));
  }

  public RootComponent876 getRoot() {
    return root;
  }

}
