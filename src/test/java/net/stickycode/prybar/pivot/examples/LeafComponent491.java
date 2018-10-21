package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent491
    implements PrybarComponent {

  private RootComponent491 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent491.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent491.class, "root"));
  }

  public RootComponent491 getRoot() {
    return root;
  }

}
