package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent679
    implements PrybarComponent {

  private RootComponent679 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent679.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent679.class, "root"));
  }

  public RootComponent679 getRoot() {
    return root;
  }

}
