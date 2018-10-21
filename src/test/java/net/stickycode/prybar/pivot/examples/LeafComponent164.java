package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent164
    implements PrybarComponent {

  private RootComponent164 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent164.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent164.class, "root"));
  }

  public RootComponent164 getRoot() {
    return root;
  }

}
