package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent409
    implements PrybarComponent {

  private RootComponent409 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent409.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent409.class, "root"));
  }

  public RootComponent409 getRoot() {
    return root;
  }

}
