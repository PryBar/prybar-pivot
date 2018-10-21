package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent290
    implements PrybarComponent {

  private RootComponent290 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent290.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent290.class, "root"));
  }

  public RootComponent290 getRoot() {
    return root;
  }

}
