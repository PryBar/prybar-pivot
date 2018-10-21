package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent461
    implements PrybarComponent {

  private RootComponent461 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent461.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent461.class, "root"));
  }

  public RootComponent461 getRoot() {
    return root;
  }

}
