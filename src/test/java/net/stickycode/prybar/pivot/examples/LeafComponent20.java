package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent20
    implements PrybarComponent {

  private RootComponent20 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent20.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent20.class, "root"));
  }

  public RootComponent20 getRoot() {
    return root;
  }

}
