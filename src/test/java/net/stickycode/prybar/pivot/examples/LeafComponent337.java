package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent337
    implements PrybarComponent {

  private RootComponent337 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent337.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent337.class, "root"));
  }

  public RootComponent337 getRoot() {
    return root;
  }

}
