package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent755
    implements PrybarComponent {

  private RootComponent755 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent755.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent755.class, "root"));
  }

  public RootComponent755 getRoot() {
    return root;
  }

}
