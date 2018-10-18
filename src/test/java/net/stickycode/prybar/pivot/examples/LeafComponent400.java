package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent400
    implements PrybarComponent {

  private RootComponent400 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent400.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent400.class, "root"));
  }

  public RootComponent400 getRoot() {
    return root;
  }

}
