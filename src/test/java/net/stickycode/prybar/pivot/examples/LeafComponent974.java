package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent974
    implements PrybarComponent {

  private RootComponent974 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent974.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent974.class, "root"));
  }

  public RootComponent974 getRoot() {
    return root;
  }

}
