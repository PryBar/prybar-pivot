package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent790
    implements PrybarComponent {

  private RootComponent790 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent790.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent790.class, "root"));
  }

  public RootComponent790 getRoot() {
    return root;
  }

}
