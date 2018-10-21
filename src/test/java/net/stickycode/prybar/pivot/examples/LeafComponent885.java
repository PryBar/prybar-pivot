package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent885
    implements PrybarComponent {

  private RootComponent885 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent885.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent885.class, "root"));
  }

  public RootComponent885 getRoot() {
    return root;
  }

}
