package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent945
    implements PrybarComponent {

  private RootComponent945 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent945.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent945.class, "root"));
  }

  public RootComponent945 getRoot() {
    return root;
  }

}
