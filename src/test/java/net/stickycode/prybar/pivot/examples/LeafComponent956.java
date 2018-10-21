package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent956
    implements PrybarComponent {

  private RootComponent956 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent956.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent956.class, "root"));
  }

  public RootComponent956 getRoot() {
    return root;
  }

}
