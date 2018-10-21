package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent944
    implements PrybarComponent {

  private RootComponent944 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent944.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent944.class, "root"));
  }

  public RootComponent944 getRoot() {
    return root;
  }

}
