package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent643
    implements PrybarComponent {

  private RootComponent643 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent643.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent643.class, "root"));
  }

  public RootComponent643 getRoot() {
    return root;
  }

}
