package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent844
    implements PrybarComponent {

  private RootComponent844 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent844.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent844.class, "root"));
  }

  public RootComponent844 getRoot() {
    return root;
  }

}
