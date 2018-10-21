package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent534
    implements PrybarComponent {

  private RootComponent534 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent534.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent534.class, "root"));
  }

  public RootComponent534 getRoot() {
    return root;
  }

}
