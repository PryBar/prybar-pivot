package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent443
    implements PrybarComponent {

  private RootComponent443 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent443.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent443.class, "root"));
  }

  public RootComponent443 getRoot() {
    return root;
  }

}
