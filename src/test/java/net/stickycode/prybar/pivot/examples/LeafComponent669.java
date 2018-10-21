package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent669
    implements PrybarComponent {

  private RootComponent669 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent669.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent669.class, "root"));
  }

  public RootComponent669 getRoot() {
    return root;
  }

}
