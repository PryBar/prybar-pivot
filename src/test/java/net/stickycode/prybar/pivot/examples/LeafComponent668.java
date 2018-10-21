package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent668
    implements PrybarComponent {

  private RootComponent668 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent668.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent668.class, "root"));
  }

  public RootComponent668 getRoot() {
    return root;
  }

}
