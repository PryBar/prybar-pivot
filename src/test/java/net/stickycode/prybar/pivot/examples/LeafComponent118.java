package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent118
    implements PrybarComponent {

  private RootComponent118 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent118.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent118.class, "root"));
  }

  public RootComponent118 getRoot() {
    return root;
  }

}
