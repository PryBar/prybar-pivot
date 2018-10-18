package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent285
    implements PrybarComponent {

  private RootComponent285 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent285.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent285.class, "root"));
  }

  public RootComponent285 getRoot() {
    return root;
  }

}
