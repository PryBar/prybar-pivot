package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent31
    implements PrybarComponent {

  private RootComponent31 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent31.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent31.class, "root"));
  }

  public RootComponent31 getRoot() {
    return root;
  }

}
