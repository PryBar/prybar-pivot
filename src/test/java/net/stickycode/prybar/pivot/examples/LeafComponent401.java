package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent401
    implements PrybarComponent {

  private RootComponent401 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent401.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent401.class, "root"));
  }

  public RootComponent401 getRoot() {
    return root;
  }

}
