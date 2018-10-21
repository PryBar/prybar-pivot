package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent375
    implements PrybarComponent {

  private RootComponent375 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent375.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent375.class, "root"));
  }

  public RootComponent375 getRoot() {
    return root;
  }

}
