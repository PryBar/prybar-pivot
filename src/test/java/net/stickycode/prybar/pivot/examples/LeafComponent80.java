package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent80
    implements PrybarComponent {

  private RootComponent80 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent80.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent80.class, "root"));
  }

  public RootComponent80 getRoot() {
    return root;
  }

}
