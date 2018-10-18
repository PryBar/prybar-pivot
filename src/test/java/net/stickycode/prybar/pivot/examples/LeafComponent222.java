package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent222
    implements PrybarComponent {

  private RootComponent222 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent222.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent222.class, "root"));
  }

  public RootComponent222 getRoot() {
    return root;
  }

}
