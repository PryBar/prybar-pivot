package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent8
    implements PrybarComponent {

  private RootComponent8 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent8.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent8.class, "root"));
  }

  public RootComponent8 getRoot() {
    return root;
  }

}
