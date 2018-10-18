package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent284
    implements PrybarComponent {

  private RootComponent284 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent284.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent284.class, "root"));
  }

  public RootComponent284 getRoot() {
    return root;
  }

}
