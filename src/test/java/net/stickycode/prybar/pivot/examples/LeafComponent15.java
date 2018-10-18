package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent15
    implements PrybarComponent {

  private RootComponent15 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent15.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent15.class, "root"));
  }

  public RootComponent15 getRoot() {
    return root;
  }

}
