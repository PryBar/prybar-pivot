package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent26
    implements PrybarComponent {

  private RootComponent26 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent26.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent26.class, "root"));
  }

  public RootComponent26 getRoot() {
    return root;
  }

}
