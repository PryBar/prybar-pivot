package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent653
    implements PrybarComponent {

  private RootComponent653 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent653.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent653.class, "root"));
  }

  public RootComponent653 getRoot() {
    return root;
  }

}
