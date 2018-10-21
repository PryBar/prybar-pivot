package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent61
    implements PrybarComponent {

  private RootComponent61 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent61.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent61.class, "root"));
  }

  public RootComponent61 getRoot() {
    return root;
  }

}
