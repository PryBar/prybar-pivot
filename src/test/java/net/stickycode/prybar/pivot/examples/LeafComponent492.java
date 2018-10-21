package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent492
    implements PrybarComponent {

  private RootComponent492 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent492.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent492.class, "root"));
  }

  public RootComponent492 getRoot() {
    return root;
  }

}
