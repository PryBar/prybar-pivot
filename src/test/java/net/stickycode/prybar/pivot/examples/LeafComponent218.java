package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent218
    implements PrybarComponent {

  private RootComponent218 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent218.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent218.class, "root"));
  }

  public RootComponent218 getRoot() {
    return root;
  }

}
