package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent972
    implements PrybarComponent {

  private RootComponent972 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent972.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent972.class, "root"));
  }

  public RootComponent972 getRoot() {
    return root;
  }

}
