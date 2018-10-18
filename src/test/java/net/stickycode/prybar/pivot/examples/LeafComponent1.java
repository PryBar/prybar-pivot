package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent1
    implements PrybarComponent {

  private RootComponent1 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent1.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent1.class, "root"));
  }

  public RootComponent1 getRoot() {
    return root;
  }

}
