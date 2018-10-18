package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent419
    implements PrybarComponent {

  private RootComponent419 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent419.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent419.class, "root"));
  }

  public RootComponent419 getRoot() {
    return root;
  }

}
