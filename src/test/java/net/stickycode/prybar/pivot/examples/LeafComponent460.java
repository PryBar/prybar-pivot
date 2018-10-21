package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent460
    implements PrybarComponent {

  private RootComponent460 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent460.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent460.class, "root"));
  }

  public RootComponent460 getRoot() {
    return root;
  }

}
