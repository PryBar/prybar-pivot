package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent426
    implements PrybarComponent {

  private RootComponent426 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent426.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent426.class, "root"));
  }

  public RootComponent426 getRoot() {
    return root;
  }

}
