package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent213
    implements PrybarComponent {

  private RootComponent213 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent213.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent213.class, "root"));
  }

  public RootComponent213 getRoot() {
    return root;
  }

}
