package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent151
    implements PrybarComponent {

  private RootComponent151 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent151.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent151.class, "root"));
  }

  public RootComponent151 getRoot() {
    return root;
  }

}
