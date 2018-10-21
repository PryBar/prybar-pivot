package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent565
    implements PrybarComponent {

  private RootComponent565 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent565.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent565.class, "root"));
  }

  public RootComponent565 getRoot() {
    return root;
  }

}
