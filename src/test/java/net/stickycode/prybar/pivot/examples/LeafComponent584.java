package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent584
    implements PrybarComponent {

  private RootComponent584 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent584.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent584.class, "root"));
  }

  public RootComponent584 getRoot() {
    return root;
  }

}
