package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent929
    implements PrybarComponent {

  private RootComponent929 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent929.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent929.class, "root"));
  }

  public RootComponent929 getRoot() {
    return root;
  }

}
