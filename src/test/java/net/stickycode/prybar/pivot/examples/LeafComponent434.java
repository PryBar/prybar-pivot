package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent434
    implements PrybarComponent {

  private RootComponent434 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent434.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent434.class, "root"));
  }

  public RootComponent434 getRoot() {
    return root;
  }

}
