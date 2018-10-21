package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent381
    implements PrybarComponent {

  private RootComponent381 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent381.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent381.class, "root"));
  }

  public RootComponent381 getRoot() {
    return root;
  }

}
