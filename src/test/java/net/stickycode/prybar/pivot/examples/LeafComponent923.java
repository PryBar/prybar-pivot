package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent923
    implements PrybarComponent {

  private RootComponent923 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent923.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent923.class, "root"));
  }

  public RootComponent923 getRoot() {
    return root;
  }

}
