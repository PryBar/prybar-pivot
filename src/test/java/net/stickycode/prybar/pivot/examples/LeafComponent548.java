package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent548
    implements PrybarComponent {

  private RootComponent548 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent548.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent548.class, "root"));
  }

  public RootComponent548 getRoot() {
    return root;
  }

}
