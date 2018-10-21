package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent453
    implements PrybarComponent {

  private RootComponent453 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent453.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent453.class, "root"));
  }

  public RootComponent453 getRoot() {
    return root;
  }

}
