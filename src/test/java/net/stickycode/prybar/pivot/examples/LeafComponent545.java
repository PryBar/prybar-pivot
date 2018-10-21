package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent545
    implements PrybarComponent {

  private RootComponent545 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent545.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent545.class, "root"));
  }

  public RootComponent545 getRoot() {
    return root;
  }

}
