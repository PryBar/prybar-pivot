package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent656
    implements PrybarComponent {

  private RootComponent656 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent656.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent656.class, "root"));
  }

  public RootComponent656 getRoot() {
    return root;
  }

}
