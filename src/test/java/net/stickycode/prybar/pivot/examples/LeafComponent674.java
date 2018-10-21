package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent674
    implements PrybarComponent {

  private RootComponent674 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent674.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent674.class, "root"));
  }

  public RootComponent674 getRoot() {
    return root;
  }

}
