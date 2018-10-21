package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent657
    implements PrybarComponent {

  private RootComponent657 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent657.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent657.class, "root"));
  }

  public RootComponent657 getRoot() {
    return root;
  }

}
