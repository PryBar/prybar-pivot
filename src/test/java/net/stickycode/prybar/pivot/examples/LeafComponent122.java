package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent122
    implements PrybarComponent {

  private RootComponent122 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent122.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent122.class, "root"));
  }

  public RootComponent122 getRoot() {
    return root;
  }

}
