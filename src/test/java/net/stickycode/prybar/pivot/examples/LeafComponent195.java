package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent195
    implements PrybarComponent {

  private RootComponent195 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent195.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent195.class, "root"));
  }

  public RootComponent195 getRoot() {
    return root;
  }

}
