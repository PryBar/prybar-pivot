package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent575
    implements PrybarComponent {

  private RootComponent575 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent575.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent575.class, "root"));
  }

  public RootComponent575 getRoot() {
    return root;
  }

}
