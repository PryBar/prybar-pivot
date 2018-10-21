package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent951
    implements PrybarComponent {

  private RootComponent951 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent951.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent951.class, "root"));
  }

  public RootComponent951 getRoot() {
    return root;
  }

}
