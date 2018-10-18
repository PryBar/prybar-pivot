package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent368
    implements PrybarComponent {

  private RootComponent368 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent368.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent368.class, "root"));
  }

  public RootComponent368 getRoot() {
    return root;
  }

}
