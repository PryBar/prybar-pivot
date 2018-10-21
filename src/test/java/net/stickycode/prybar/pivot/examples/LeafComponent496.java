package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent496
    implements PrybarComponent {

  private RootComponent496 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent496.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent496.class, "root"));
  }

  public RootComponent496 getRoot() {
    return root;
  }

}
