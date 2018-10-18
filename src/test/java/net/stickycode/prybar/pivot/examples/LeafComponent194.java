package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent194
    implements PrybarComponent {

  private RootComponent194 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent194.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent194.class, "root"));
  }

  public RootComponent194 getRoot() {
    return root;
  }

}
