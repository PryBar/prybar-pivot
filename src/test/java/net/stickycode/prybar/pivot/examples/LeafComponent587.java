package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent587
    implements PrybarComponent {

  private RootComponent587 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent587.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent587.class, "root"));
  }

  public RootComponent587 getRoot() {
    return root;
  }

}
