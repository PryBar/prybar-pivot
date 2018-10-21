package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent75
    implements PrybarComponent {

  private RootComponent75 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent75.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent75.class, "root"));
  }

  public RootComponent75 getRoot() {
    return root;
  }

}
