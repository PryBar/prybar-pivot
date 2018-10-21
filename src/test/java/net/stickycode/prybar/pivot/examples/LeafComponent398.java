package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent398
    implements PrybarComponent {

  private RootComponent398 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent398.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent398.class, "root"));
  }

  public RootComponent398 getRoot() {
    return root;
  }

}
