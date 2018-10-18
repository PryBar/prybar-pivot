package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent630
    implements PrybarComponent {

  private RootComponent630 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent630.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent630.class, "root"));
  }

  public RootComponent630 getRoot() {
    return root;
  }

}
