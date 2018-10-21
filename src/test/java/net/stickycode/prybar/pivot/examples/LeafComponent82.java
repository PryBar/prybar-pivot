package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent82
    implements PrybarComponent {

  private RootComponent82 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent82.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent82.class, "root"));
  }

  public RootComponent82 getRoot() {
    return root;
  }

}
