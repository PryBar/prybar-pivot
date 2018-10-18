package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent309
    implements PrybarComponent {

  private RootComponent309 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent309.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent309.class, "root"));
  }

  public RootComponent309 getRoot() {
    return root;
  }

}
