package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent378
    implements PrybarComponent {

  private RootComponent378 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent378.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent378.class, "root"));
  }

  public RootComponent378 getRoot() {
    return root;
  }

}
