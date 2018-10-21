package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent493
    implements PrybarComponent {

  private RootComponent493 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent493.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent493.class, "root"));
  }

  public RootComponent493 getRoot() {
    return root;
  }

}
