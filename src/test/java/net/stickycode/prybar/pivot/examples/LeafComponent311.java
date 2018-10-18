package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent311
    implements PrybarComponent {

  private RootComponent311 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent311.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent311.class, "root"));
  }

  public RootComponent311 getRoot() {
    return root;
  }

}
