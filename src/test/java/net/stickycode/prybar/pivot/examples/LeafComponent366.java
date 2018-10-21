package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent366
    implements PrybarComponent {

  private RootComponent366 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent366.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent366.class, "root"));
  }

  public RootComponent366 getRoot() {
    return root;
  }

}
