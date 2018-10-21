package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent662
    implements PrybarComponent {

  private RootComponent662 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent662.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent662.class, "root"));
  }

  public RootComponent662 getRoot() {
    return root;
  }

}
