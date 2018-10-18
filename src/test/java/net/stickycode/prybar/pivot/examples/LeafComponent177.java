package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent177
    implements PrybarComponent {

  private RootComponent177 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent177.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent177.class, "root"));
  }

  public RootComponent177 getRoot() {
    return root;
  }

}
