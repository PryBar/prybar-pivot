package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent212
    implements PrybarComponent {

  private RootComponent212 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent212.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent212.class, "root"));
  }

  public RootComponent212 getRoot() {
    return root;
  }

}
