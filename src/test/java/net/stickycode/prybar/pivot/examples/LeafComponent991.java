package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent991
    implements PrybarComponent {

  private RootComponent991 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent991.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent991.class, "root"));
  }

  public RootComponent991 getRoot() {
    return root;
  }

}
