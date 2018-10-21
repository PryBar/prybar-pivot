package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent303
    implements PrybarComponent {

  private RootComponent303 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent303.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent303.class, "root"));
  }

  public RootComponent303 getRoot() {
    return root;
  }

}
