package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent734
    implements PrybarComponent {

  private RootComponent734 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent734.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent734.class, "root"));
  }

  public RootComponent734 getRoot() {
    return root;
  }

}
