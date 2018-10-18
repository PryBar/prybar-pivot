package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent546
    implements PrybarComponent {

  private RootComponent546 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent546.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent546.class, "root"));
  }

  public RootComponent546 getRoot() {
    return root;
  }

}
