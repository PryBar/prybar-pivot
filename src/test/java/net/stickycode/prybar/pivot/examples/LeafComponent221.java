package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent221
    implements PrybarComponent {

  private RootComponent221 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent221.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent221.class, "root"));
  }

  public RootComponent221 getRoot() {
    return root;
  }

}
