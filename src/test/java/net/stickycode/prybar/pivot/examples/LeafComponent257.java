package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent257
    implements PrybarComponent {

  private RootComponent257 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent257.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent257.class, "root"));
  }

  public RootComponent257 getRoot() {
    return root;
  }

}
