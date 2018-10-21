package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent550
    implements PrybarComponent {

  private RootComponent550 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent550.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent550.class, "root"));
  }

  public RootComponent550 getRoot() {
    return root;
  }

}
