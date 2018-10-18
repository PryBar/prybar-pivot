package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent675
    implements PrybarComponent {

  private RootComponent675 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent675.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent675.class, "root"));
  }

  public RootComponent675 getRoot() {
    return root;
  }

}
