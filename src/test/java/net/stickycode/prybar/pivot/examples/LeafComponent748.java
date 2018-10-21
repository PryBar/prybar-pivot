package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent748
    implements PrybarComponent {

  private RootComponent748 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent748.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent748.class, "root"));
  }

  public RootComponent748 getRoot() {
    return root;
  }

}
