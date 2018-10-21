package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent678
    implements PrybarComponent {

  private RootComponent678 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent678.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent678.class, "root"));
  }

  public RootComponent678 getRoot() {
    return root;
  }

}
