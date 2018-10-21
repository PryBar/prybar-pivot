package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent330
    implements PrybarComponent {

  private RootComponent330 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent330.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent330.class, "root"));
  }

  public RootComponent330 getRoot() {
    return root;
  }

}
