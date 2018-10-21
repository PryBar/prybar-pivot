package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent691
    implements PrybarComponent {

  private RootComponent691 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent691.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent691.class, "root"));
  }

  public RootComponent691 getRoot() {
    return root;
  }

}
