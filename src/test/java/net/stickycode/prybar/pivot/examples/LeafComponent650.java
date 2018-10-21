package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent650
    implements PrybarComponent {

  private RootComponent650 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent650.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent650.class, "root"));
  }

  public RootComponent650 getRoot() {
    return root;
  }

}
