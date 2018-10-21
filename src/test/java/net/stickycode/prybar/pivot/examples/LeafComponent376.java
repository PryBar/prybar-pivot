package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent376
    implements PrybarComponent {

  private RootComponent376 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent376.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent376.class, "root"));
  }

  public RootComponent376 getRoot() {
    return root;
  }

}
