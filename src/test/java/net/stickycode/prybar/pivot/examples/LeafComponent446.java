package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent446
    implements PrybarComponent {

  private RootComponent446 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent446.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent446.class, "root"));
  }

  public RootComponent446 getRoot() {
    return root;
  }

}
