package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent247
    implements PrybarComponent {

  private RootComponent247 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent247.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent247.class, "root"));
  }

  public RootComponent247 getRoot() {
    return root;
  }

}
