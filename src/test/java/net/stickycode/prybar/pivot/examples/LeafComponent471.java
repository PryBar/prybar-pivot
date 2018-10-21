package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent471
    implements PrybarComponent {

  private RootComponent471 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent471.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent471.class, "root"));
  }

  public RootComponent471 getRoot() {
    return root;
  }

}
