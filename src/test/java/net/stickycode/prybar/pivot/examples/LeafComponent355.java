package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent355
    implements PrybarComponent {

  private RootComponent355 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent355.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent355.class, "root"));
  }

  public RootComponent355 getRoot() {
    return root;
  }

}
