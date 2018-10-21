package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent259
    implements PrybarComponent {

  private RootComponent259 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent259.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent259.class, "root"));
  }

  public RootComponent259 getRoot() {
    return root;
  }

}
