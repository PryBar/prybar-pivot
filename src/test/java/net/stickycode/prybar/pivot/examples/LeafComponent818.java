package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent818
    implements PrybarComponent {

  private RootComponent818 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent818.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent818.class, "root"));
  }

  public RootComponent818 getRoot() {
    return root;
  }

}
