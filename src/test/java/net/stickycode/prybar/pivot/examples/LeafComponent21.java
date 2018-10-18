package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent21
    implements PrybarComponent {

  private RootComponent21 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent21.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent21.class, "root"));
  }

  public RootComponent21 getRoot() {
    return root;
  }

}
