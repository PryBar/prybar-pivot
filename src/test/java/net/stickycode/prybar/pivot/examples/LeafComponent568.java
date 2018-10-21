package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent568
    implements PrybarComponent {

  private RootComponent568 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent568.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent568.class, "root"));
  }

  public RootComponent568 getRoot() {
    return root;
  }

}
