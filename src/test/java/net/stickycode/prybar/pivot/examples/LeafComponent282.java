package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent282
    implements PrybarComponent {

  private RootComponent282 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent282.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent282.class, "root"));
  }

  public RootComponent282 getRoot() {
    return root;
  }

}
