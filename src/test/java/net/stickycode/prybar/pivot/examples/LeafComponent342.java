package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent342
    implements PrybarComponent {

  private RootComponent342 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent342.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent342.class, "root"));
  }

  public RootComponent342 getRoot() {
    return root;
  }

}
