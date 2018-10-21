package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent486
    implements PrybarComponent {

  private RootComponent486 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent486.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent486.class, "root"));
  }

  public RootComponent486 getRoot() {
    return root;
  }

}
