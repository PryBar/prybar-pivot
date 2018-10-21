package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent119
    implements PrybarComponent {

  private RootComponent119 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent119.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent119.class, "root"));
  }

  public RootComponent119 getRoot() {
    return root;
  }

}
