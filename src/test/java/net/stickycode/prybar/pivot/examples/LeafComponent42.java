package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent42
    implements PrybarComponent {

  private RootComponent42 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent42.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent42.class, "root"));
  }

  public RootComponent42 getRoot() {
    return root;
  }

}
