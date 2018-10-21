package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent720
    implements PrybarComponent {

  private RootComponent720 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent720.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent720.class, "root"));
  }

  public RootComponent720 getRoot() {
    return root;
  }

}
