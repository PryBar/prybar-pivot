package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent521
    implements PrybarComponent {

  private RootComponent521 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent521.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent521.class, "root"));
  }

  public RootComponent521 getRoot() {
    return root;
  }

}
