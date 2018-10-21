package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent700
    implements PrybarComponent {

  private RootComponent700 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent700.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent700.class, "root"));
  }

  public RootComponent700 getRoot() {
    return root;
  }

}
