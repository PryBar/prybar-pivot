package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent396
    implements PrybarComponent {

  private RootComponent396 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent396.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent396.class, "root"));
  }

  public RootComponent396 getRoot() {
    return root;
  }

}
