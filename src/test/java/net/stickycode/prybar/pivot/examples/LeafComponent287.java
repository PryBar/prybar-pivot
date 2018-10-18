package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent287
    implements PrybarComponent {

  private RootComponent287 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent287.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent287.class, "root"));
  }

  public RootComponent287 getRoot() {
    return root;
  }

}
