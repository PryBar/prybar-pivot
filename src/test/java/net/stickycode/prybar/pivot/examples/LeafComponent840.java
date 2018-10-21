package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent840
    implements PrybarComponent {

  private RootComponent840 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent840.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent840.class, "root"));
  }

  public RootComponent840 getRoot() {
    return root;
  }

}
