package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent188
    implements PrybarComponent {

  private RootComponent188 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent188.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent188.class, "root"));
  }

  public RootComponent188 getRoot() {
    return root;
  }

}
