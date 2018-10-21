package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent85
    implements PrybarComponent {

  private RootComponent85 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent85.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent85.class, "root"));
  }

  public RootComponent85 getRoot() {
    return root;
  }

}
