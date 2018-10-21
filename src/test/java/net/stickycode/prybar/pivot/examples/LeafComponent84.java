package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent84
    implements PrybarComponent {

  private RootComponent84 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent84.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent84.class, "root"));
  }

  public RootComponent84 getRoot() {
    return root;
  }

}
