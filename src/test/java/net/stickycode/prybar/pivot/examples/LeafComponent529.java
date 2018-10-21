package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent529
    implements PrybarComponent {

  private RootComponent529 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent529.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent529.class, "root"));
  }

  public RootComponent529 getRoot() {
    return root;
  }

}
