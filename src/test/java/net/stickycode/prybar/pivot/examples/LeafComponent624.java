package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent624
    implements PrybarComponent {

  private RootComponent624 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent624.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent624.class, "root"));
  }

  public RootComponent624 getRoot() {
    return root;
  }

}
