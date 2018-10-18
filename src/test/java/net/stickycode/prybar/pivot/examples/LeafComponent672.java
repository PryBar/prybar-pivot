package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent672
    implements PrybarComponent {

  private RootComponent672 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent672.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent672.class, "root"));
  }

  public RootComponent672 getRoot() {
    return root;
  }

}
