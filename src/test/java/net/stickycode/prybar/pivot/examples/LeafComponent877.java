package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent877
    implements PrybarComponent {

  private RootComponent877 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent877.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent877.class, "root"));
  }

  public RootComponent877 getRoot() {
    return root;
  }

}
