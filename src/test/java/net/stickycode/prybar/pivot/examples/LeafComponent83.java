package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent83
    implements PrybarComponent {

  private RootComponent83 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent83.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent83.class, "root"));
  }

  public RootComponent83 getRoot() {
    return root;
  }

}
