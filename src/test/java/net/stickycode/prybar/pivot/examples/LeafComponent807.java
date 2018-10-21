package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent807
    implements PrybarComponent {

  private RootComponent807 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent807.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent807.class, "root"));
  }

  public RootComponent807 getRoot() {
    return root;
  }

}
