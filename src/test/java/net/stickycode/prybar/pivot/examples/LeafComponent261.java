package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent261
    implements PrybarComponent {

  private RootComponent261 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent261.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent261.class, "root"));
  }

  public RootComponent261 getRoot() {
    return root;
  }

}
