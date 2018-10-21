package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent559
    implements PrybarComponent {

  private RootComponent559 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent559.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent559.class, "root"));
  }

  public RootComponent559 getRoot() {
    return root;
  }

}
