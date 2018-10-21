package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent712
    implements PrybarComponent {

  private RootComponent712 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent712.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent712.class, "root"));
  }

  public RootComponent712 getRoot() {
    return root;
  }

}
