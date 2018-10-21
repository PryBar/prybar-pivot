package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent267
    implements PrybarComponent {

  private RootComponent267 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent267.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent267.class, "root"));
  }

  public RootComponent267 getRoot() {
    return root;
  }

}
