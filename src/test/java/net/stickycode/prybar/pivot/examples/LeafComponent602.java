package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent602
    implements PrybarComponent {

  private RootComponent602 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent602.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent602.class, "root"));
  }

  public RootComponent602 getRoot() {
    return root;
  }

}
