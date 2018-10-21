package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent483
    implements PrybarComponent {

  private RootComponent483 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent483.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent483.class, "root"));
  }

  public RootComponent483 getRoot() {
    return root;
  }

}
