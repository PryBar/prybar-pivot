package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent667
    implements PrybarComponent {

  private RootComponent667 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent667.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent667.class, "root"));
  }

  public RootComponent667 getRoot() {
    return root;
  }

}
