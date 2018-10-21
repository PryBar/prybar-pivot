package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent506
    implements PrybarComponent {

  private RootComponent506 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent506.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent506.class, "root"));
  }

  public RootComponent506 getRoot() {
    return root;
  }

}
