package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent384
    implements PrybarComponent {

  private RootComponent384 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent384.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent384.class, "root"));
  }

  public RootComponent384 getRoot() {
    return root;
  }

}
