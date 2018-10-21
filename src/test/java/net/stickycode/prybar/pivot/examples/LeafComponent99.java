package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent99
    implements PrybarComponent {

  private RootComponent99 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent99.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent99.class, "root"));
  }

  public RootComponent99 getRoot() {
    return root;
  }

}
