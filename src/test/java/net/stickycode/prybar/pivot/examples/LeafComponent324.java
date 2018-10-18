package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent324
    implements PrybarComponent {

  private RootComponent324 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent324.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent324.class, "root"));
  }

  public RootComponent324 getRoot() {
    return root;
  }

}
