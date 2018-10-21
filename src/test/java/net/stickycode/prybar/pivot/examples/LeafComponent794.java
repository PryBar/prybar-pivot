package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent794
    implements PrybarComponent {

  private RootComponent794 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent794.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent794.class, "root"));
  }

  public RootComponent794 getRoot() {
    return root;
  }

}
