package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent134
    implements PrybarComponent {

  private RootComponent134 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent134.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent134.class, "root"));
  }

  public RootComponent134 getRoot() {
    return root;
  }

}
