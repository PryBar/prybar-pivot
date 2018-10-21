package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent48
    implements PrybarComponent {

  private RootComponent48 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent48.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent48.class, "root"));
  }

  public RootComponent48 getRoot() {
    return root;
  }

}
