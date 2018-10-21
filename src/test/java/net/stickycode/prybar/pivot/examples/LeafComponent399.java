package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent399
    implements PrybarComponent {

  private RootComponent399 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent399.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent399.class, "root"));
  }

  public RootComponent399 getRoot() {
    return root;
  }

}
