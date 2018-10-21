package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent451
    implements PrybarComponent {

  private RootComponent451 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent451.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent451.class, "root"));
  }

  public RootComponent451 getRoot() {
    return root;
  }

}
