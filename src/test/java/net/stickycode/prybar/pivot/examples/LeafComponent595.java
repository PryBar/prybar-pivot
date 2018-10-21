package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent595
    implements PrybarComponent {

  private RootComponent595 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent595.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent595.class, "root"));
  }

  public RootComponent595 getRoot() {
    return root;
  }

}
