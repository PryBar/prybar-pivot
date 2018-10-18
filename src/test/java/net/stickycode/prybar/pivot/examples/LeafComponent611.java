package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent611
    implements PrybarComponent {

  private RootComponent611 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent611.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent611.class, "root"));
  }

  public RootComponent611 getRoot() {
    return root;
  }

}
