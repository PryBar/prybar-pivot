package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent636
    implements PrybarComponent {

  private RootComponent636 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent636.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent636.class, "root"));
  }

  public RootComponent636 getRoot() {
    return root;
  }

}
