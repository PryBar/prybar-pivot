package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent623
    implements PrybarComponent {

  private RootComponent623 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent623.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent623.class, "root"));
  }

  public RootComponent623 getRoot() {
    return root;
  }

}
