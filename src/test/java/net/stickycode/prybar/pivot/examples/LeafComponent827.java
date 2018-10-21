package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent827
    implements PrybarComponent {

  private RootComponent827 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent827.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent827.class, "root"));
  }

  public RootComponent827 getRoot() {
    return root;
  }

}
