package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent363
    implements PrybarComponent {

  private RootComponent363 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent363.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent363.class, "root"));
  }

  public RootComponent363 getRoot() {
    return root;
  }

}
