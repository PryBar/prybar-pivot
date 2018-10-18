package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent203
    implements PrybarComponent {

  private RootComponent203 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent203.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent203.class, "root"));
  }

  public RootComponent203 getRoot() {
    return root;
  }

}
