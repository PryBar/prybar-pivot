package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent256
    implements PrybarComponent {

  private RootComponent256 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent256.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent256.class, "root"));
  }

  public RootComponent256 getRoot() {
    return root;
  }

}
