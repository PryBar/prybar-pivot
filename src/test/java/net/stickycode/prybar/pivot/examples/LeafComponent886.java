package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent886
    implements PrybarComponent {

  private RootComponent886 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent886.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent886.class, "root"));
  }

  public RootComponent886 getRoot() {
    return root;
  }

}
