package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent746
    implements PrybarComponent {

  private RootComponent746 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent746.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent746.class, "root"));
  }

  public RootComponent746 getRoot() {
    return root;
  }

}
