package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent910
    implements PrybarComponent {

  private RootComponent910 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent910.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent910.class, "root"));
  }

  public RootComponent910 getRoot() {
    return root;
  }

}
