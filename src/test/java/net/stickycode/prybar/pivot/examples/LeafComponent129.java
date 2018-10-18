package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent129
    implements PrybarComponent {

  private RootComponent129 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent129.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent129.class, "root"));
  }

  public RootComponent129 getRoot() {
    return root;
  }

}
