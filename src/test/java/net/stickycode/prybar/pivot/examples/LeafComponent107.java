package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent107
    implements PrybarComponent {

  private RootComponent107 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent107.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent107.class, "root"));
  }

  public RootComponent107 getRoot() {
    return root;
  }

}
