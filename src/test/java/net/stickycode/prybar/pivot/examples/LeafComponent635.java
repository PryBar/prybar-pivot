package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent635
    implements PrybarComponent {

  private RootComponent635 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent635.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent635.class, "root"));
  }

  public RootComponent635 getRoot() {
    return root;
  }

}
