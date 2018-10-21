package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent533
    implements PrybarComponent {

  private RootComponent533 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent533.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent533.class, "root"));
  }

  public RootComponent533 getRoot() {
    return root;
  }

}
