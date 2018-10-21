package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent848
    implements PrybarComponent {

  private RootComponent848 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent848.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent848.class, "root"));
  }

  public RootComponent848 getRoot() {
    return root;
  }

}
