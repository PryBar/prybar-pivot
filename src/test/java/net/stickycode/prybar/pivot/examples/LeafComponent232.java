package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent232
    implements PrybarComponent {

  private RootComponent232 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent232.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent232.class, "root"));
  }

  public RootComponent232 getRoot() {
    return root;
  }

}
