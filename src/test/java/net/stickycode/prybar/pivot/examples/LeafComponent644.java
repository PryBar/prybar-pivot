package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent644
    implements PrybarComponent {

  private RootComponent644 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent644.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent644.class, "root"));
  }

  public RootComponent644 getRoot() {
    return root;
  }

}
