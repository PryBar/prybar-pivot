package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent858
    implements PrybarComponent {

  private RootComponent858 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent858.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent858.class, "root"));
  }

  public RootComponent858 getRoot() {
    return root;
  }

}
