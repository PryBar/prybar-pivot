package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent947
    implements PrybarComponent {

  private RootComponent947 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent947.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent947.class, "root"));
  }

  public RootComponent947 getRoot() {
    return root;
  }

}
