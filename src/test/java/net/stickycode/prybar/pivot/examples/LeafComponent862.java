package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent862
    implements PrybarComponent {

  private RootComponent862 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent862.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent862.class, "root"));
  }

  public RootComponent862 getRoot() {
    return root;
  }

}
