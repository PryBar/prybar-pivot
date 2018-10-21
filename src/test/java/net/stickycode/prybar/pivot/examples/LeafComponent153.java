package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent153
    implements PrybarComponent {

  private RootComponent153 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent153.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent153.class, "root"));
  }

  public RootComponent153 getRoot() {
    return root;
  }

}
