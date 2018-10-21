package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent392
    implements PrybarComponent {

  private RootComponent392 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent392.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent392.class, "root"));
  }

  public RootComponent392 getRoot() {
    return root;
  }

}
