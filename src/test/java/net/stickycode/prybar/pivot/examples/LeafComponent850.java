package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent850
    implements PrybarComponent {

  private RootComponent850 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent850.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent850.class, "root"));
  }

  public RootComponent850 getRoot() {
    return root;
  }

}
