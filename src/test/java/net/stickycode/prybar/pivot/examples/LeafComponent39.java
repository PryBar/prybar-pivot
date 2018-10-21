package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent39
    implements PrybarComponent {

  private RootComponent39 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent39.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent39.class, "root"));
  }

  public RootComponent39 getRoot() {
    return root;
  }

}
