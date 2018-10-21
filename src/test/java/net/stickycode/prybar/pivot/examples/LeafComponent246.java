package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent246
    implements PrybarComponent {

  private RootComponent246 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent246.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent246.class, "root"));
  }

  public RootComponent246 getRoot() {
    return root;
  }

}
