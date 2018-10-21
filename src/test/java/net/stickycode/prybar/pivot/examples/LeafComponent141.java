package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent141
    implements PrybarComponent {

  private RootComponent141 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent141.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent141.class, "root"));
  }

  public RootComponent141 getRoot() {
    return root;
  }

}
