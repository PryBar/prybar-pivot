package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent909
    implements PrybarComponent {

  private RootComponent909 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent909.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent909.class, "root"));
  }

  public RootComponent909 getRoot() {
    return root;
  }

}
