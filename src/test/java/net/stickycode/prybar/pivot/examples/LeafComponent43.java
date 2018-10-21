package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent43
    implements PrybarComponent {

  private RootComponent43 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent43.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent43.class, "root"));
  }

  public RootComponent43 getRoot() {
    return root;
  }

}
