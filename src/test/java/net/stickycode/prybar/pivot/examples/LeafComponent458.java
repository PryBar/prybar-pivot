package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent458
    implements PrybarComponent {

  private RootComponent458 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent458.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent458.class, "root"));
  }

  public RootComponent458 getRoot() {
    return root;
  }

}
