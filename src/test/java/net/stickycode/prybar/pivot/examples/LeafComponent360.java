package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent360
    implements PrybarComponent {

  private RootComponent360 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent360.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent360.class, "root"));
  }

  public RootComponent360 getRoot() {
    return root;
  }

}
