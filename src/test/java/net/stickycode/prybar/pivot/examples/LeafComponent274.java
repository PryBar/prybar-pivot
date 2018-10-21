package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent274
    implements PrybarComponent {

  private RootComponent274 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent274.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent274.class, "root"));
  }

  public RootComponent274 getRoot() {
    return root;
  }

}
