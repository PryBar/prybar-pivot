package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent590
    implements PrybarComponent {

  private RootComponent590 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent590.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent590.class, "root"));
  }

  public RootComponent590 getRoot() {
    return root;
  }

}
