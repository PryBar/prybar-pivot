package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent423
    implements PrybarComponent {

  private RootComponent423 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent423.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent423.class, "root"));
  }

  public RootComponent423 getRoot() {
    return root;
  }

}
