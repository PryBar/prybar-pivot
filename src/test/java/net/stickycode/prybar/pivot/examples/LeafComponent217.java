package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent217
    implements PrybarComponent {

  private RootComponent217 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent217.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent217.class, "root"));
  }

  public RootComponent217 getRoot() {
    return root;
  }

}
