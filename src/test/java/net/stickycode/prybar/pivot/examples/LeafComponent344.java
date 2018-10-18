package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent344
    implements PrybarComponent {

  private RootComponent344 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent344.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent344.class, "root"));
  }

  public RootComponent344 getRoot() {
    return root;
  }

}
