package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent10
    implements PrybarComponent {

  private RootComponent10 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent10.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent10.class, "root"));
  }

  public RootComponent10 getRoot() {
    return root;
  }

}
