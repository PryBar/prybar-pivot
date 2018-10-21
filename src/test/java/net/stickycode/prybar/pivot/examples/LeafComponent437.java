package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent437
    implements PrybarComponent {

  private RootComponent437 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent437.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent437.class, "root"));
  }

  public RootComponent437 getRoot() {
    return root;
  }

}
