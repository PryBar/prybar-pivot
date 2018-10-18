package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent298
    implements PrybarComponent {

  private RootComponent298 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent298.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent298.class, "root"));
  }

  public RootComponent298 getRoot() {
    return root;
  }

}
