package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent549
    implements PrybarComponent {

  private RootComponent549 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent549.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent549.class, "root"));
  }

  public RootComponent549 getRoot() {
    return root;
  }

}
