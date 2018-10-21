package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent813
    implements PrybarComponent {

  private RootComponent813 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent813.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent813.class, "root"));
  }

  public RootComponent813 getRoot() {
    return root;
  }

}
