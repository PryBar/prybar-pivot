package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent173
    implements PrybarComponent {

  private RootComponent173 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent173.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent173.class, "root"));
  }

  public RootComponent173 getRoot() {
    return root;
  }

}
