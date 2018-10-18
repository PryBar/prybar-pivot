package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent320
    implements PrybarComponent {

  private RootComponent320 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent320.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent320.class, "root"));
  }

  public RootComponent320 getRoot() {
    return root;
  }

}
