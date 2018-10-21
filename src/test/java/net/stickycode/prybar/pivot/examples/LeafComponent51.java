package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent51
    implements PrybarComponent {

  private RootComponent51 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent51.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent51.class, "root"));
  }

  public RootComponent51 getRoot() {
    return root;
  }

}
