package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent160
    implements PrybarComponent {

  private RootComponent160 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent160.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent160.class, "root"));
  }

  public RootComponent160 getRoot() {
    return root;
  }

}
