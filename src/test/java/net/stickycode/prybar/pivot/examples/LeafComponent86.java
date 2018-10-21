package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent86
    implements PrybarComponent {

  private RootComponent86 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent86.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent86.class, "root"));
  }

  public RootComponent86 getRoot() {
    return root;
  }

}
