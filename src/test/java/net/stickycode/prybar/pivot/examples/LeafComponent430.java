package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent430
    implements PrybarComponent {

  private RootComponent430 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent430.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent430.class, "root"));
  }

  public RootComponent430 getRoot() {
    return root;
  }

}
