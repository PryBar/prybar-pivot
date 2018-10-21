package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent17
    implements PrybarComponent {

  private RootComponent17 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent17.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent17.class, "root"));
  }

  public RootComponent17 getRoot() {
    return root;
  }

}
