package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent206
    implements PrybarComponent {

  private RootComponent206 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent206.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent206.class, "root"));
  }

  public RootComponent206 getRoot() {
    return root;
  }

}
