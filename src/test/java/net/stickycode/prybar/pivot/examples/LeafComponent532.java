package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent532
    implements PrybarComponent {

  private RootComponent532 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent532.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent532.class, "root"));
  }

  public RootComponent532 getRoot() {
    return root;
  }

}
