package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent855
    implements PrybarComponent {

  private RootComponent855 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent855.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent855.class, "root"));
  }

  public RootComponent855 getRoot() {
    return root;
  }

}
