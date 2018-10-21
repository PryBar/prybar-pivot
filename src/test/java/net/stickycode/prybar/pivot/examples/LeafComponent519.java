package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent519
    implements PrybarComponent {

  private RootComponent519 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent519.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent519.class, "root"));
  }

  public RootComponent519 getRoot() {
    return root;
  }

}
