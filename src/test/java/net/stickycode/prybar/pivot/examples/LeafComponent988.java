package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent988
    implements PrybarComponent {

  private RootComponent988 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent988.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent988.class, "root"));
  }

  public RootComponent988 getRoot() {
    return root;
  }

}
