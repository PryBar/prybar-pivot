package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent59
    implements PrybarComponent {

  private RootComponent59 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent59.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent59.class, "root"));
  }

  public RootComponent59 getRoot() {
    return root;
  }

}
