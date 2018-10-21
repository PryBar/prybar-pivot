package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent81
    implements PrybarComponent {

  private RootComponent81 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent81.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent81.class, "root"));
  }

  public RootComponent81 getRoot() {
    return root;
  }

}
