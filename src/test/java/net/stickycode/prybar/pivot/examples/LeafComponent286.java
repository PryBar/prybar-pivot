package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent286
    implements PrybarComponent {

  private RootComponent286 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent286.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent286.class, "root"));
  }

  public RootComponent286 getRoot() {
    return root;
  }

}
