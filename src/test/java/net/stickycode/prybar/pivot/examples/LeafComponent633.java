package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent633
    implements PrybarComponent {

  private RootComponent633 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent633.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent633.class, "root"));
  }

  public RootComponent633 getRoot() {
    return root;
  }

}
