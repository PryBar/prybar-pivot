package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent140
    implements PrybarComponent {

  private RootComponent140 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent140.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent140.class, "root"));
  }

  public RootComponent140 getRoot() {
    return root;
  }

}
