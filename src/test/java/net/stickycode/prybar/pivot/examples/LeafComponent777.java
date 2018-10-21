package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent777
    implements PrybarComponent {

  private RootComponent777 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent777.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent777.class, "root"));
  }

  public RootComponent777 getRoot() {
    return root;
  }

}
