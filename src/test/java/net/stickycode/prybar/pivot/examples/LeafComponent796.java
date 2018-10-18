package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent796
    implements PrybarComponent {

  private RootComponent796 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent796.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent796.class, "root"));
  }

  public RootComponent796 getRoot() {
    return root;
  }

}
