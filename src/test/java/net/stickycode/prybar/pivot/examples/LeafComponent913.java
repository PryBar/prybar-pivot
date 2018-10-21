package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent913
    implements PrybarComponent {

  private RootComponent913 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent913.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent913.class, "root"));
  }

  public RootComponent913 getRoot() {
    return root;
  }

}
