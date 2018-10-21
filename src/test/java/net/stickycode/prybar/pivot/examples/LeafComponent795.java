package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent795
    implements PrybarComponent {

  private RootComponent795 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent795.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent795.class, "root"));
  }

  public RootComponent795 getRoot() {
    return root;
  }

}
