package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent117
    implements PrybarComponent {

  private RootComponent117 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent117.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent117.class, "root"));
  }

  public RootComponent117 getRoot() {
    return root;
  }

}
