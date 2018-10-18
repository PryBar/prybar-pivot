package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent390
    implements PrybarComponent {

  private RootComponent390 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent390.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent390.class, "root"));
  }

  public RootComponent390 getRoot() {
    return root;
  }

}
