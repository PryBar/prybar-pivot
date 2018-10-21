package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent405
    implements PrybarComponent {

  private RootComponent405 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent405.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent405.class, "root"));
  }

  public RootComponent405 getRoot() {
    return root;
  }

}
