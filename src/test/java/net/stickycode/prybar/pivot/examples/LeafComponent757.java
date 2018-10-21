package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent757
    implements PrybarComponent {

  private RootComponent757 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent757.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent757.class, "root"));
  }

  public RootComponent757 getRoot() {
    return root;
  }

}
