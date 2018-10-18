package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent642
    implements PrybarComponent {

  private RootComponent642 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent642.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent642.class, "root"));
  }

  public RootComponent642 getRoot() {
    return root;
  }

}
