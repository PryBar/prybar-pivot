package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent973
    implements PrybarComponent {

  private RootComponent973 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent973.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent973.class, "root"));
  }

  public RootComponent973 getRoot() {
    return root;
  }

}
