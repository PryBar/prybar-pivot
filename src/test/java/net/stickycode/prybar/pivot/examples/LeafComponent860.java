package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent860
    implements PrybarComponent {

  private RootComponent860 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent860.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent860.class, "root"));
  }

  public RootComponent860 getRoot() {
    return root;
  }

}
