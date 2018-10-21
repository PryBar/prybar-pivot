package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent793
    implements PrybarComponent {

  private RootComponent793 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent793.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent793.class, "root"));
  }

  public RootComponent793 getRoot() {
    return root;
  }

}
