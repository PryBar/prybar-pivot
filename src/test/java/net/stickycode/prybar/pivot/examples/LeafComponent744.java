package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent744
    implements PrybarComponent {

  private RootComponent744 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent744.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent744.class, "root"));
  }

  public RootComponent744 getRoot() {
    return root;
  }

}
