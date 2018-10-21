package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent604
    implements PrybarComponent {

  private RootComponent604 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent604.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent604.class, "root"));
  }

  public RootComponent604 getRoot() {
    return root;
  }

}
