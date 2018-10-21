package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent404
    implements PrybarComponent {

  private RootComponent404 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent404.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent404.class, "root"));
  }

  public RootComponent404 getRoot() {
    return root;
  }

}
