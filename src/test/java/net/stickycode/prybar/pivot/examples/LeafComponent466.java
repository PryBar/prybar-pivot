package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent466
    implements PrybarComponent {

  private RootComponent466 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent466.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent466.class, "root"));
  }

  public RootComponent466 getRoot() {
    return root;
  }

}
