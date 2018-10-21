package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent273
    implements PrybarComponent {

  private RootComponent273 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent273.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent273.class, "root"));
  }

  public RootComponent273 getRoot() {
    return root;
  }

}
