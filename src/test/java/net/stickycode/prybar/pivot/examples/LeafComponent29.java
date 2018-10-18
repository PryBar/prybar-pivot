package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent29
    implements PrybarComponent {

  private RootComponent29 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent29.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent29.class, "root"));
  }

  public RootComponent29 getRoot() {
    return root;
  }

}
