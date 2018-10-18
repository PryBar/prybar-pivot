package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent111
    implements PrybarComponent {

  private RootComponent111 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent111.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent111.class, "root"));
  }

  public RootComponent111 getRoot() {
    return root;
  }

}
