package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent557
    implements PrybarComponent {

  private RootComponent557 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent557.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent557.class, "root"));
  }

  public RootComponent557 getRoot() {
    return root;
  }

}
