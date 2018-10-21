package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent477
    implements PrybarComponent {

  private RootComponent477 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent477.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent477.class, "root"));
  }

  public RootComponent477 getRoot() {
    return root;
  }

}
