package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent941
    implements PrybarComponent {

  private RootComponent941 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent941.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent941.class, "root"));
  }

  public RootComponent941 getRoot() {
    return root;
  }

}
