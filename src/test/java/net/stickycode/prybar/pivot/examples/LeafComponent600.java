package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent600
    implements PrybarComponent {

  private RootComponent600 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent600.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent600.class, "root"));
  }

  public RootComponent600 getRoot() {
    return root;
  }

}
