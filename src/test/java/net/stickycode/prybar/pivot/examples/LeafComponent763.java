package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent763
    implements PrybarComponent {

  private RootComponent763 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent763.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent763.class, "root"));
  }

  public RootComponent763 getRoot() {
    return root;
  }

}
