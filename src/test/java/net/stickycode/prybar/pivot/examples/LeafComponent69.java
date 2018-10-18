package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent69
    implements PrybarComponent {

  private RootComponent69 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent69.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent69.class, "root"));
  }

  public RootComponent69 getRoot() {
    return root;
  }

}
