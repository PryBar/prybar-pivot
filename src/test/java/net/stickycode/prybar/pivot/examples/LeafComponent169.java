package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent169
    implements PrybarComponent {

  private RootComponent169 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent169.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent169.class, "root"));
  }

  public RootComponent169 getRoot() {
    return root;
  }

}
