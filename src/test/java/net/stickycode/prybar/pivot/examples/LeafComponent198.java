package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent198
    implements PrybarComponent {

  private RootComponent198 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent198.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent198.class, "root"));
  }

  public RootComponent198 getRoot() {
    return root;
  }

}
