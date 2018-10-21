package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent53
    implements PrybarComponent {

  private RootComponent53 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent53.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent53.class, "root"));
  }

  public RootComponent53 getRoot() {
    return root;
  }

}
