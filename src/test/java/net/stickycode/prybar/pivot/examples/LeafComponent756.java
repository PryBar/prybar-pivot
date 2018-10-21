package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent756
    implements PrybarComponent {

  private RootComponent756 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent756.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent756.class, "root"));
  }

  public RootComponent756 getRoot() {
    return root;
  }

}
