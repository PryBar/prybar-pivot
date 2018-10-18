package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent822
    implements PrybarComponent {

  private RootComponent822 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent822.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent822.class, "root"));
  }

  public RootComponent822 getRoot() {
    return root;
  }

}
