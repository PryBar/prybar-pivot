package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent581
    implements PrybarComponent {

  private RootComponent581 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent581.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent581.class, "root"));
  }

  public RootComponent581 getRoot() {
    return root;
  }

}
