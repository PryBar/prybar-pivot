package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent332
    implements PrybarComponent {

  private RootComponent332 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent332.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent332.class, "root"));
  }

  public RootComponent332 getRoot() {
    return root;
  }

}
