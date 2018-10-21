package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent182
    implements PrybarComponent {

  private RootComponent182 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent182.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent182.class, "root"));
  }

  public RootComponent182 getRoot() {
    return root;
  }

}
