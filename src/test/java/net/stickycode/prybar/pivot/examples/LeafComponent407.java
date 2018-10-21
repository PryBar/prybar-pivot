package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent407
    implements PrybarComponent {

  private RootComponent407 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent407.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent407.class, "root"));
  }

  public RootComponent407 getRoot() {
    return root;
  }

}
