package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent992
    implements PrybarComponent {

  private RootComponent992 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent992.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent992.class, "root"));
  }

  public RootComponent992 getRoot() {
    return root;
  }

}
