package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent306
    implements PrybarComponent {

  private RootComponent306 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent306.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent306.class, "root"));
  }

  public RootComponent306 getRoot() {
    return root;
  }

}
