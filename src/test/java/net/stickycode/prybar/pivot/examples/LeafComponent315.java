package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent315
    implements PrybarComponent {

  private RootComponent315 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent315.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent315.class, "root"));
  }

  public RootComponent315 getRoot() {
    return root;
  }

}
