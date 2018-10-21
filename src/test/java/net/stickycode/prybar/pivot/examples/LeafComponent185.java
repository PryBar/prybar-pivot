package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent185
    implements PrybarComponent {

  private RootComponent185 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent185.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent185.class, "root"));
  }

  public RootComponent185 getRoot() {
    return root;
  }

}
