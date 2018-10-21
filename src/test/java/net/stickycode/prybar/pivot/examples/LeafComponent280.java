package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent280
    implements PrybarComponent {

  private RootComponent280 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent280.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent280.class, "root"));
  }

  public RootComponent280 getRoot() {
    return root;
  }

}
