package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent976
    implements PrybarComponent {

  private RootComponent976 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent976.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent976.class, "root"));
  }

  public RootComponent976 getRoot() {
    return root;
  }

}
