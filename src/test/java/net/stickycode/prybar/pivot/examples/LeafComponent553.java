package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent553
    implements PrybarComponent {

  private RootComponent553 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent553.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent553.class, "root"));
  }

  public RootComponent553 getRoot() {
    return root;
  }

}
