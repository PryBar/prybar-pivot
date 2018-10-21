package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent511
    implements PrybarComponent {

  private RootComponent511 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent511.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent511.class, "root"));
  }

  public RootComponent511 getRoot() {
    return root;
  }

}
