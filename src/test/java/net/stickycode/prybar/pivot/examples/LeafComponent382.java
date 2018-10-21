package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent382
    implements PrybarComponent {

  private RootComponent382 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent382.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent382.class, "root"));
  }

  public RootComponent382 getRoot() {
    return root;
  }

}
