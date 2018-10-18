package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent373
    implements PrybarComponent {

  private RootComponent373 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent373.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent373.class, "root"));
  }

  public RootComponent373 getRoot() {
    return root;
  }

}
