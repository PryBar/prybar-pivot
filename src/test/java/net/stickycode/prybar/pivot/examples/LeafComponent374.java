package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent374
    implements PrybarComponent {

  private RootComponent374 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent374.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent374.class, "root"));
  }

  public RootComponent374 getRoot() {
    return root;
  }

}
