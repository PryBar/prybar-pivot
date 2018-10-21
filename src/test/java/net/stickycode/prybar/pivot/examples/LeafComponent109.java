package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent109
    implements PrybarComponent {

  private RootComponent109 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent109.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent109.class, "root"));
  }

  public RootComponent109 getRoot() {
    return root;
  }

}
