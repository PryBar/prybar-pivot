package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent556
    implements PrybarComponent {

  private RootComponent556 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent556.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent556.class, "root"));
  }

  public RootComponent556 getRoot() {
    return root;
  }

}
