package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent76
    implements PrybarComponent {

  private RootComponent76 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent76.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent76.class, "root"));
  }

  public RootComponent76 getRoot() {
    return root;
  }

}
