package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent479
    implements PrybarComponent {

  private RootComponent479 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent479.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent479.class, "root"));
  }

  public RootComponent479 getRoot() {
    return root;
  }

}
