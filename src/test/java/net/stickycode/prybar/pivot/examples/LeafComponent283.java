package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent283
    implements PrybarComponent {

  private RootComponent283 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent283.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent283.class, "root"));
  }

  public RootComponent283 getRoot() {
    return root;
  }

}
