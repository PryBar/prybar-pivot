package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent503
    implements PrybarComponent {

  private RootComponent503 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent503.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent503.class, "root"));
  }

  public RootComponent503 getRoot() {
    return root;
  }

}
