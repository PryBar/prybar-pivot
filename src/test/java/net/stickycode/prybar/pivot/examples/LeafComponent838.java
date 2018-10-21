package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent838
    implements PrybarComponent {

  private RootComponent838 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent838.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent838.class, "root"));
  }

  public RootComponent838 getRoot() {
    return root;
  }

}
