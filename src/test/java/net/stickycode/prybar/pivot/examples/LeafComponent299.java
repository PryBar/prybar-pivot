package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent299
    implements PrybarComponent {

  private RootComponent299 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent299.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent299.class, "root"));
  }

  public RootComponent299 getRoot() {
    return root;
  }

}
