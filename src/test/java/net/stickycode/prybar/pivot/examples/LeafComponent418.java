package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent418
    implements PrybarComponent {

  private RootComponent418 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent418.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent418.class, "root"));
  }

  public RootComponent418 getRoot() {
    return root;
  }

}
