package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent797
    implements PrybarComponent {

  private RootComponent797 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent797.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent797.class, "root"));
  }

  public RootComponent797 getRoot() {
    return root;
  }

}
