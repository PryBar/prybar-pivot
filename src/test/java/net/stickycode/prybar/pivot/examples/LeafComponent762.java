package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent762
    implements PrybarComponent {

  private RootComponent762 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent762.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent762.class, "root"));
  }

  public RootComponent762 getRoot() {
    return root;
  }

}
