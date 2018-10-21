package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent670
    implements PrybarComponent {

  private RootComponent670 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent670.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent670.class, "root"));
  }

  public RootComponent670 getRoot() {
    return root;
  }

}
