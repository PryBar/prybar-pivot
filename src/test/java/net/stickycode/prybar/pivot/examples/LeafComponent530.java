package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent530
    implements PrybarComponent {

  private RootComponent530 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent530.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent530.class, "root"));
  }

  public RootComponent530 getRoot() {
    return root;
  }

}
