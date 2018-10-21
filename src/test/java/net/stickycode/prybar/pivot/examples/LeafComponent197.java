package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent197
    implements PrybarComponent {

  private RootComponent197 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent197.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent197.class, "root"));
  }

  public RootComponent197 getRoot() {
    return root;
  }

}
