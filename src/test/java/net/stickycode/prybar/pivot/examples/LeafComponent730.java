package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent730
    implements PrybarComponent {

  private RootComponent730 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent730.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent730.class, "root"));
  }

  public RootComponent730 getRoot() {
    return root;
  }

}
