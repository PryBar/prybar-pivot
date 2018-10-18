package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent91
    implements PrybarComponent {

  private RootComponent91 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent91.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent91.class, "root"));
  }

  public RootComponent91 getRoot() {
    return root;
  }

}
