package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent578
    implements PrybarComponent {

  private RootComponent578 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent578.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent578.class, "root"));
  }

  public RootComponent578 getRoot() {
    return root;
  }

}
