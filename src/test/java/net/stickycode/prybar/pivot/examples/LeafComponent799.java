package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent799
    implements PrybarComponent {

  private RootComponent799 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent799.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent799.class, "root"));
  }

  public RootComponent799 getRoot() {
    return root;
  }

}
