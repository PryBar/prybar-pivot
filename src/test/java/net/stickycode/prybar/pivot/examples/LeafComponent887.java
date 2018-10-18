package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent887
    implements PrybarComponent {

  private RootComponent887 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent887.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent887.class, "root"));
  }

  public RootComponent887 getRoot() {
    return root;
  }

}
