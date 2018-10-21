package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent932
    implements PrybarComponent {

  private RootComponent932 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent932.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent932.class, "root"));
  }

  public RootComponent932 getRoot() {
    return root;
  }

}
