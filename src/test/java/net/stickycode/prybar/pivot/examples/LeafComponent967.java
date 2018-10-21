package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent967
    implements PrybarComponent {

  private RootComponent967 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent967.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent967.class, "root"));
  }

  public RootComponent967 getRoot() {
    return root;
  }

}
