package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent317
    implements PrybarComponent {

  private RootComponent317 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent317.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent317.class, "root"));
  }

  public RootComponent317 getRoot() {
    return root;
  }

}
