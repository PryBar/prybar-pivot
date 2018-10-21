package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent895
    implements PrybarComponent {

  private RootComponent895 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent895.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent895.class, "root"));
  }

  public RootComponent895 getRoot() {
    return root;
  }

}
