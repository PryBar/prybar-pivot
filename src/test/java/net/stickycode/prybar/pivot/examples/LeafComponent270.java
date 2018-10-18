package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent270
    implements PrybarComponent {

  private RootComponent270 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent270.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent270.class, "root"));
  }

  public RootComponent270 getRoot() {
    return root;
  }

}
