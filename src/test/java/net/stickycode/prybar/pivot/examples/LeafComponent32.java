package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent32
    implements PrybarComponent {

  private RootComponent32 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent32.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent32.class, "root"));
  }

  public RootComponent32 getRoot() {
    return root;
  }

}
