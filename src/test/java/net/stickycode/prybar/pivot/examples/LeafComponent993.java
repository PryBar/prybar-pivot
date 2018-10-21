package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent993
    implements PrybarComponent {

  private RootComponent993 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent993.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent993.class, "root"));
  }

  public RootComponent993 getRoot() {
    return root;
  }

}
