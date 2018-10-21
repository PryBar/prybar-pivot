package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent352
    implements PrybarComponent {

  private RootComponent352 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent352.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent352.class, "root"));
  }

  public RootComponent352 getRoot() {
    return root;
  }

}
