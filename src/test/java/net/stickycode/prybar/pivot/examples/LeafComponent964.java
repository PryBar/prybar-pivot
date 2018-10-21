package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent964
    implements PrybarComponent {

  private RootComponent964 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent964.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent964.class, "root"));
  }

  public RootComponent964 getRoot() {
    return root;
  }

}
