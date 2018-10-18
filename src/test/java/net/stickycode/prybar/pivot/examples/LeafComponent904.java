package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent904
    implements PrybarComponent {

  private RootComponent904 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent904.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent904.class, "root"));
  }

  public RootComponent904 getRoot() {
    return root;
  }

}
