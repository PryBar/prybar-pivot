package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent920
    implements PrybarComponent {

  private RootComponent920 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent920.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent920.class, "root"));
  }

  public RootComponent920 getRoot() {
    return root;
  }

}
