package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent800
    implements PrybarComponent {

  private RootComponent800 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent800.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent800.class, "root"));
  }

  public RootComponent800 getRoot() {
    return root;
  }

}
