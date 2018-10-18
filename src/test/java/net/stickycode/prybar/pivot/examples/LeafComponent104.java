package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent104
    implements PrybarComponent {

  private RootComponent104 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent104.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent104.class, "root"));
  }

  public RootComponent104 getRoot() {
    return root;
  }

}
