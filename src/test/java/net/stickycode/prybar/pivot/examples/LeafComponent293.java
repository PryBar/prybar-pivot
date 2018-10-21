package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent293
    implements PrybarComponent {

  private RootComponent293 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent293.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent293.class, "root"));
  }

  public RootComponent293 getRoot() {
    return root;
  }

}
