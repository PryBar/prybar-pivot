package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent120
    implements PrybarComponent {

  private RootComponent120 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent120.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent120.class, "root"));
  }

  public RootComponent120 getRoot() {
    return root;
  }

}
