package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent354
    implements PrybarComponent {

  private RootComponent354 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent354.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent354.class, "root"));
  }

  public RootComponent354 getRoot() {
    return root;
  }

}
