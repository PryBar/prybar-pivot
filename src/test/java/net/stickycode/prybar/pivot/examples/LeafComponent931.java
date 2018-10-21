package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent931
    implements PrybarComponent {

  private RootComponent931 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent931.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent931.class, "root"));
  }

  public RootComponent931 getRoot() {
    return root;
  }

}
