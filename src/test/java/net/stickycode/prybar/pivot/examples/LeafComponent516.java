package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent516
    implements PrybarComponent {

  private RootComponent516 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent516.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent516.class, "root"));
  }

  public RootComponent516 getRoot() {
    return root;
  }

}
