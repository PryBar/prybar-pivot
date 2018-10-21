package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent655
    implements PrybarComponent {

  private RootComponent655 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent655.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent655.class, "root"));
  }

  public RootComponent655 getRoot() {
    return root;
  }

}
