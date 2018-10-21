package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent385
    implements PrybarComponent {

  private RootComponent385 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent385.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent385.class, "root"));
  }

  public RootComponent385 getRoot() {
    return root;
  }

}
