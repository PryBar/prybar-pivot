package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent272
    implements PrybarComponent {

  private RootComponent272 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent272.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent272.class, "root"));
  }

  public RootComponent272 getRoot() {
    return root;
  }

}
