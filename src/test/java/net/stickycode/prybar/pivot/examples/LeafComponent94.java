package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent94
    implements PrybarComponent {

  private RootComponent94 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent94.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent94.class, "root"));
  }

  public RootComponent94 getRoot() {
    return root;
  }

}
