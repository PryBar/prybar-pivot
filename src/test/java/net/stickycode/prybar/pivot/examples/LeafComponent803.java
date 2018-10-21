package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent803
    implements PrybarComponent {

  private RootComponent803 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent803.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent803.class, "root"));
  }

  public RootComponent803 getRoot() {
    return root;
  }

}
