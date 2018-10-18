package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent202
    implements PrybarComponent {

  private RootComponent202 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent202.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent202.class, "root"));
  }

  public RootComponent202 getRoot() {
    return root;
  }

}
