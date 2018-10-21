package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent263
    implements PrybarComponent {

  private RootComponent263 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent263.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent263.class, "root"));
  }

  public RootComponent263 getRoot() {
    return root;
  }

}
