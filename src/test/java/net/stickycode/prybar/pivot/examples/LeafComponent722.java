package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent722
    implements PrybarComponent {

  private RootComponent722 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent722.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent722.class, "root"));
  }

  public RootComponent722 getRoot() {
    return root;
  }

}
