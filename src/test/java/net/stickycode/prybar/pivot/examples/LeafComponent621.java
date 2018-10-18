package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent621
    implements PrybarComponent {

  private RootComponent621 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent621.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent621.class, "root"));
  }

  public RootComponent621 getRoot() {
    return root;
  }

}
