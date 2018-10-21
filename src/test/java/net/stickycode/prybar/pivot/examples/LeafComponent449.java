package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent449
    implements PrybarComponent {

  private RootComponent449 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent449.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent449.class, "root"));
  }

  public RootComponent449 getRoot() {
    return root;
  }

}
