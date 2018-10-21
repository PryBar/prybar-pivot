package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent607
    implements PrybarComponent {

  private RootComponent607 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent607.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent607.class, "root"));
  }

  public RootComponent607 getRoot() {
    return root;
  }

}
