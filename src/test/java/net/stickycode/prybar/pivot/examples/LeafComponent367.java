package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent367
    implements PrybarComponent {

  private RootComponent367 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent367.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent367.class, "root"));
  }

  public RootComponent367 getRoot() {
    return root;
  }

}
