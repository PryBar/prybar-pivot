package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent543
    implements PrybarComponent {

  private RootComponent543 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent543.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent543.class, "root"));
  }

  public RootComponent543 getRoot() {
    return root;
  }

}
