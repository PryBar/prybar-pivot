package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent919
    implements PrybarComponent {

  private RootComponent919 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent919.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent919.class, "root"));
  }

  public RootComponent919 getRoot() {
    return root;
  }

}
