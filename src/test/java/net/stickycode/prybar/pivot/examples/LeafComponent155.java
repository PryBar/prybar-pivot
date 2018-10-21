package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent155
    implements PrybarComponent {

  private RootComponent155 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent155.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent155.class, "root"));
  }

  public RootComponent155 getRoot() {
    return root;
  }

}
