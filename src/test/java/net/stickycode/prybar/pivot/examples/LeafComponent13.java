package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent13
    implements PrybarComponent {

  private RootComponent13 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent13.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent13.class, "root"));
  }

  public RootComponent13 getRoot() {
    return root;
  }

}
