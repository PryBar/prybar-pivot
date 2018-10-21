package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent459
    implements PrybarComponent {

  private RootComponent459 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent459.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent459.class, "root"));
  }

  public RootComponent459 getRoot() {
    return root;
  }

}
