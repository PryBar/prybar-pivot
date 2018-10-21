package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent131
    implements PrybarComponent {

  private RootComponent131 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent131.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent131.class, "root"));
  }

  public RootComponent131 getRoot() {
    return root;
  }

}
