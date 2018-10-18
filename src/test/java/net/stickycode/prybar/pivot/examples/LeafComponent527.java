package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent527
    implements PrybarComponent {

  private RootComponent527 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent527.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent527.class, "root"));
  }

  public RootComponent527 getRoot() {
    return root;
  }

}
