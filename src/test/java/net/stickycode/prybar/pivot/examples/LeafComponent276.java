package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent276
    implements PrybarComponent {

  private RootComponent276 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent276.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent276.class, "root"));
  }

  public RootComponent276 getRoot() {
    return root;
  }

}
