package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent628
    implements PrybarComponent {

  private RootComponent628 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent628.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent628.class, "root"));
  }

  public RootComponent628 getRoot() {
    return root;
  }

}
