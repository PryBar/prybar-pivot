package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent36
    implements PrybarComponent {

  private RootComponent36 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent36.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent36.class, "root"));
  }

  public RootComponent36 getRoot() {
    return root;
  }

}
