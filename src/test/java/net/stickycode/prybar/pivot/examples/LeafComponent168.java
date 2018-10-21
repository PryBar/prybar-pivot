package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent168
    implements PrybarComponent {

  private RootComponent168 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent168.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent168.class, "root"));
  }

  public RootComponent168 getRoot() {
    return root;
  }

}
