package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent394
    implements PrybarComponent {

  private RootComponent394 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent394.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent394.class, "root"));
  }

  public RootComponent394 getRoot() {
    return root;
  }

}
