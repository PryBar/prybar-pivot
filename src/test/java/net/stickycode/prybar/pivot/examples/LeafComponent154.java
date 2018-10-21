package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent154
    implements PrybarComponent {

  private RootComponent154 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent154.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent154.class, "root"));
  }

  public RootComponent154 getRoot() {
    return root;
  }

}
