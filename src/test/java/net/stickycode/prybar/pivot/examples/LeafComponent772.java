package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent772
    implements PrybarComponent {

  private RootComponent772 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent772.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent772.class, "root"));
  }

  public RootComponent772 getRoot() {
    return root;
  }

}
