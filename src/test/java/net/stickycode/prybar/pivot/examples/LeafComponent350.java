package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent350
    implements PrybarComponent {

  private RootComponent350 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent350.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent350.class, "root"));
  }

  public RootComponent350 getRoot() {
    return root;
  }

}
