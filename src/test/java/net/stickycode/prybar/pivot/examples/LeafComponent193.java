package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent193
    implements PrybarComponent {

  private RootComponent193 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent193.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent193.class, "root"));
  }

  public RootComponent193 getRoot() {
    return root;
  }

}
