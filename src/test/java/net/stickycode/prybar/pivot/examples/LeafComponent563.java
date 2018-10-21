package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent563
    implements PrybarComponent {

  private RootComponent563 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent563.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent563.class, "root"));
  }

  public RootComponent563 getRoot() {
    return root;
  }

}
