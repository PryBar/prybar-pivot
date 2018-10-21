package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent208
    implements PrybarComponent {

  private RootComponent208 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent208.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent208.class, "root"));
  }

  public RootComponent208 getRoot() {
    return root;
  }

}
