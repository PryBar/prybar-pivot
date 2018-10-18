package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent45
    implements PrybarComponent {

  private RootComponent45 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent45.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent45.class, "root"));
  }

  public RootComponent45 getRoot() {
    return root;
  }

}
