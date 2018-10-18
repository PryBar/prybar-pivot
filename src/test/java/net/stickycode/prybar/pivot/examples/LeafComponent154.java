package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent154
    implements PrybarComponent {

  private RootComponent154 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent154.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent154.class, "root"));
  }

  public RootComponent154 getRoot() {
    return root;
  }

}
