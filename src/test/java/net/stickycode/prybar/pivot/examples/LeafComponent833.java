package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent833
    implements PrybarComponent {

  private RootComponent833 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent833.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent833.class, "root"));
  }

  public RootComponent833 getRoot() {
    return root;
  }

}
