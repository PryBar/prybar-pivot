package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent823
    implements PrybarComponent {

  private RootComponent823 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent823.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent823.class, "root"));
  }

  public RootComponent823 getRoot() {
    return root;
  }

}
