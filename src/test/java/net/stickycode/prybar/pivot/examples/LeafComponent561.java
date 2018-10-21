package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent561
    implements PrybarComponent {

  private RootComponent561 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent561.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent561.class, "root"));
  }

  public RootComponent561 getRoot() {
    return root;
  }

}
