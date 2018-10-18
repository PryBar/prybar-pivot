package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent228
    implements PrybarComponent {

  private RootComponent228 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent228.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent228.class, "root"));
  }

  public RootComponent228 getRoot() {
    return root;
  }

}
