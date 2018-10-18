package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent440
    implements PrybarComponent {

  private RootComponent440 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent440.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent440.class, "root"));
  }

  public RootComponent440 getRoot() {
    return root;
  }

}
