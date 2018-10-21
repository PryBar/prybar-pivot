package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent552
    implements PrybarComponent {

  private RootComponent552 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent552.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent552.class, "root"));
  }

  public RootComponent552 getRoot() {
    return root;
  }

}
