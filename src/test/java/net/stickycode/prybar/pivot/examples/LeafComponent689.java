package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent689
    implements PrybarComponent {

  private RootComponent689 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent689.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent689.class, "root"));
  }

  public RootComponent689 getRoot() {
    return root;
  }

}
