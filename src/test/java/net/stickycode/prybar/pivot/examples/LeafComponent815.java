package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent815
    implements PrybarComponent {

  private RootComponent815 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent815.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent815.class, "root"));
  }

  public RootComponent815 getRoot() {
    return root;
  }

}
