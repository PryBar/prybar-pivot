package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent490
    implements PrybarComponent {

  private RootComponent490 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent490.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent490.class, "root"));
  }

  public RootComponent490 getRoot() {
    return root;
  }

}
