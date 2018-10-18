package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent513
    implements PrybarComponent {

  private RootComponent513 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent513.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent513.class, "root"));
  }

  public RootComponent513 getRoot() {
    return root;
  }

}
