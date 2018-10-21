package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent260
    implements PrybarComponent {

  private RootComponent260 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent260.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent260.class, "root"));
  }

  public RootComponent260 getRoot() {
    return root;
  }

}
