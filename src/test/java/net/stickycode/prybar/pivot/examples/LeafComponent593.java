package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent593
    implements PrybarComponent {

  private RootComponent593 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent593.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent593.class, "root"));
  }

  public RootComponent593 getRoot() {
    return root;
  }

}
