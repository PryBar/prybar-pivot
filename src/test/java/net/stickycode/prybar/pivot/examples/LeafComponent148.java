package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent148
    implements PrybarComponent {

  private RootComponent148 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent148.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent148.class, "root"));
  }

  public RootComponent148 getRoot() {
    return root;
  }

}
