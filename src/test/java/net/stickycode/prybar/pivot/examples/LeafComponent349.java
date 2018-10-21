package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent349
    implements PrybarComponent {

  private RootComponent349 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent349.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent349.class, "root"));
  }

  public RootComponent349 getRoot() {
    return root;
  }

}
