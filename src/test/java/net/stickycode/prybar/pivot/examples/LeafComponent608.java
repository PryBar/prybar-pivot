package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent608
    implements PrybarComponent {

  private RootComponent608 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent608.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent608.class, "root"));
  }

  public RootComponent608 getRoot() {
    return root;
  }

}
