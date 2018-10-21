package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent144
    implements PrybarComponent {

  private RootComponent144 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent144.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent144.class, "root"));
  }

  public RootComponent144 getRoot() {
    return root;
  }

}
