package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent292
    implements PrybarComponent {

  private RootComponent292 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent292.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent292.class, "root"));
  }

  public RootComponent292 getRoot() {
    return root;
  }

}
