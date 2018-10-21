package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent696
    implements PrybarComponent {

  private RootComponent696 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent696.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent696.class, "root"));
  }

  public RootComponent696 getRoot() {
    return root;
  }

}
