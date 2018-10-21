package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent893
    implements PrybarComponent {

  private RootComponent893 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent893.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent893.class, "root"));
  }

  public RootComponent893 getRoot() {
    return root;
  }

}
