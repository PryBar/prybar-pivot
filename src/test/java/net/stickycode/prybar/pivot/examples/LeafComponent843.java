package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent843
    implements PrybarComponent {

  private RootComponent843 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent843.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent843.class, "root"));
  }

  public RootComponent843 getRoot() {
    return root;
  }

}
