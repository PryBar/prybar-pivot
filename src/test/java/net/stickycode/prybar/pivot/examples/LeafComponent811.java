package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent811
    implements PrybarComponent {

  private RootComponent811 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent811.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent811.class, "root"));
  }

  public RootComponent811 getRoot() {
    return root;
  }

}
