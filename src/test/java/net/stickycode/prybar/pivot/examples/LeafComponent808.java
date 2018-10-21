package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent808
    implements PrybarComponent {

  private RootComponent808 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent808.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent808.class, "root"));
  }

  public RootComponent808 getRoot() {
    return root;
  }

}
