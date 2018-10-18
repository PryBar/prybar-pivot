package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent472
    implements PrybarComponent {

  private RootComponent472 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent472.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent472.class, "root"));
  }

  public RootComponent472 getRoot() {
    return root;
  }

}
