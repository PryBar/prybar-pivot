package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent625
    implements PrybarComponent {

  private RootComponent625 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent625.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent625.class, "root"));
  }

  public RootComponent625 getRoot() {
    return root;
  }

}
