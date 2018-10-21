package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent138
    implements PrybarComponent {

  private RootComponent138 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent138.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent138.class, "root"));
  }

  public RootComponent138 getRoot() {
    return root;
  }

}
