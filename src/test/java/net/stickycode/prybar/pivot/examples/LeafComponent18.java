package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent18
    implements PrybarComponent {

  private RootComponent18 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent18.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent18.class, "root"));
  }

  public RootComponent18 getRoot() {
    return root;
  }

}
