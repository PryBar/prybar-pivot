package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent579
    implements PrybarComponent {

  private RootComponent579 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent579.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent579.class, "root"));
  }

  public RootComponent579 getRoot() {
    return root;
  }

}
