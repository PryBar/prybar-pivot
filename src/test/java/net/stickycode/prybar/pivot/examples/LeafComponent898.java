package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent898
    implements PrybarComponent {

  private RootComponent898 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent898.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent898.class, "root"));
  }

  public RootComponent898 getRoot() {
    return root;
  }

}
