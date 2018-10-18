package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent716
    implements PrybarComponent {

  private RootComponent716 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent716.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent716.class, "root"));
  }

  public RootComponent716 getRoot() {
    return root;
  }

}
