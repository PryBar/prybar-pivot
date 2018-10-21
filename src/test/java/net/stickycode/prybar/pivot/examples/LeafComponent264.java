package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent264
    implements PrybarComponent {

  private RootComponent264 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent264.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent264.class, "root"));
  }

  public RootComponent264 getRoot() {
    return root;
  }

}
