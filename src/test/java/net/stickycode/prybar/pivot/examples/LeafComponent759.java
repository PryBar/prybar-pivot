package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent759
    implements PrybarComponent {

  private RootComponent759 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent759.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent759.class, "root"));
  }

  public RootComponent759 getRoot() {
    return root;
  }

}
