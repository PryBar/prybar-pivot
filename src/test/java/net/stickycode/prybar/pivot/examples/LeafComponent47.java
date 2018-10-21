package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent47
    implements PrybarComponent {

  private RootComponent47 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent47.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent47.class, "root"));
  }

  public RootComponent47 getRoot() {
    return root;
  }

}
