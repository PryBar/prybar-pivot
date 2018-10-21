package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent853
    implements PrybarComponent {

  private RootComponent853 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent853.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent853.class, "root"));
  }

  public RootComponent853 getRoot() {
    return root;
  }

}
