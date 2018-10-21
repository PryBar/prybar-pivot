package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent377
    implements PrybarComponent {

  private RootComponent377 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent377.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent377.class, "root"));
  }

  public RootComponent377 getRoot() {
    return root;
  }

}
