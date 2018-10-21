package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent336
    implements PrybarComponent {

  private RootComponent336 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent336.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent336.class, "root"));
  }

  public RootComponent336 getRoot() {
    return root;
  }

}
