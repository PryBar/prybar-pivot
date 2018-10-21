package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent589
    implements PrybarComponent {

  private RootComponent589 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent589.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent589.class, "root"));
  }

  public RootComponent589 getRoot() {
    return root;
  }

}
