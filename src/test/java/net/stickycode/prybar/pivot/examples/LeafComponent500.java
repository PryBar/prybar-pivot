package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent500
    implements PrybarComponent {

  private RootComponent500 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent500.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent500.class, "root"));
  }

  public RootComponent500 getRoot() {
    return root;
  }

}
