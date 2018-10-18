package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent536
    implements PrybarComponent {

  private RootComponent536 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent536.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent536.class, "root"));
  }

  public RootComponent536 getRoot() {
    return root;
  }

}
