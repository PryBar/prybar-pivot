package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent574
    implements PrybarComponent {

  private RootComponent574 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent574.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent574.class, "root"));
  }

  public RootComponent574 getRoot() {
    return root;
  }

}
