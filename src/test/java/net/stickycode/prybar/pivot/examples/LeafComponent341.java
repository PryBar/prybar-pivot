package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent341
    implements PrybarComponent {

  private RootComponent341 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent341.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent341.class, "root"));
  }

  public RootComponent341 getRoot() {
    return root;
  }

}
