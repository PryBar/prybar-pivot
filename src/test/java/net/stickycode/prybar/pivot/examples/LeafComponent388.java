package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent388
    implements PrybarComponent {

  private RootComponent388 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent388.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent388.class, "root"));
  }

  public RootComponent388 getRoot() {
    return root;
  }

}
