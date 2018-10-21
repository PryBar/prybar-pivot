package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent727
    implements PrybarComponent {

  private RootComponent727 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent727.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent727.class, "root"));
  }

  public RootComponent727 getRoot() {
    return root;
  }

}
