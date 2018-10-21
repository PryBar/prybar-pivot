package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent307
    implements PrybarComponent {

  private RootComponent307 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent307.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent307.class, "root"));
  }

  public RootComponent307 getRoot() {
    return root;
  }

}
