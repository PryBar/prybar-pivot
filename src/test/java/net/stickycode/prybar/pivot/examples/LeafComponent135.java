package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent135
    implements PrybarComponent {

  private RootComponent135 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent135.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent135.class, "root"));
  }

  public RootComponent135 getRoot() {
    return root;
  }

}
