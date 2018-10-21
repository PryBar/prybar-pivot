package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent422
    implements PrybarComponent {

  private RootComponent422 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent422.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent422.class, "root"));
  }

  public RootComponent422 getRoot() {
    return root;
  }

}
