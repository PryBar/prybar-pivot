package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent985
    implements PrybarComponent {

  private RootComponent985 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent985.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent985.class, "root"));
  }

  public RootComponent985 getRoot() {
    return root;
  }

}
