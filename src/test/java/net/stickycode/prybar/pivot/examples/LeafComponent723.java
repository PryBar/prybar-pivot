package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent723
    implements PrybarComponent {

  private RootComponent723 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent723.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent723.class, "root"));
  }

  public RootComponent723 getRoot() {
    return root;
  }

}
