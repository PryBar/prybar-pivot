package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent285
    implements PrybarComponent {

  private RootComponent285 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent285.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent285.class, "root"));
  }

  public RootComponent285 getRoot() {
    return root;
  }

}
