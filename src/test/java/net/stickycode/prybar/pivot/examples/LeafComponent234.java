package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent234
    implements PrybarComponent {

  private RootComponent234 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent234.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent234.class, "root"));
  }

  public RootComponent234 getRoot() {
    return root;
  }

}
