package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent101
    implements PrybarComponent {

  private RootComponent101 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent101.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent101.class, "root"));
  }

  public RootComponent101 getRoot() {
    return root;
  }

}
