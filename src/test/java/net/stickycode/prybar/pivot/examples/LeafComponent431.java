package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent431
    implements PrybarComponent {

  private RootComponent431 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent431.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent431.class, "root"));
  }

  public RootComponent431 getRoot() {
    return root;
  }

}
