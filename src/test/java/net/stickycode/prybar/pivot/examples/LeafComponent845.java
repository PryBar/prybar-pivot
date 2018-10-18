package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent845
    implements PrybarComponent {

  private RootComponent845 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent845.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent845.class, "root"));
  }

  public RootComponent845 getRoot() {
    return root;
  }

}
