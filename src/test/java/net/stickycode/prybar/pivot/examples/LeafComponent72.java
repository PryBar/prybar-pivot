package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent72
    implements PrybarComponent {

  private RootComponent72 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent72.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent72.class, "root"));
  }

  public RootComponent72 getRoot() {
    return root;
  }

}
