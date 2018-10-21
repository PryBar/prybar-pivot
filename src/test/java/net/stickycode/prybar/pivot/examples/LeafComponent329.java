package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent329
    implements PrybarComponent {

  private RootComponent329 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent329.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent329.class, "root"));
  }

  public RootComponent329 getRoot() {
    return root;
  }

}
