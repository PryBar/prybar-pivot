package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent598
    implements PrybarComponent {

  private RootComponent598 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent598.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent598.class, "root"));
  }

  public RootComponent598 getRoot() {
    return root;
  }

}
