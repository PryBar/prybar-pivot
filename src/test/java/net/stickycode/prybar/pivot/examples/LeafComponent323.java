package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent323
    implements PrybarComponent {

  private RootComponent323 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent323.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent323.class, "root"));
  }

  public RootComponent323 getRoot() {
    return root;
  }

}
