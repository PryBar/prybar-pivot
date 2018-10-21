package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent785
    implements PrybarComponent {

  private RootComponent785 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent785.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent785.class, "root"));
  }

  public RootComponent785 getRoot() {
    return root;
  }

}
