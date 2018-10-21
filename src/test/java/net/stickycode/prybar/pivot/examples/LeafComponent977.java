package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent977
    implements PrybarComponent {

  private RootComponent977 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent977.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent977.class, "root"));
  }

  public RootComponent977 getRoot() {
    return root;
  }

}
