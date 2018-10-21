package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent89
    implements PrybarComponent {

  private RootComponent89 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent89.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent89.class, "root"));
  }

  public RootComponent89 getRoot() {
    return root;
  }

}
