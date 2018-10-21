package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent764
    implements PrybarComponent {

  private RootComponent764 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent764.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent764.class, "root"));
  }

  public RootComponent764 getRoot() {
    return root;
  }

}
