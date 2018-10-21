package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent66
    implements PrybarComponent {

  private RootComponent66 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent66.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent66.class, "root"));
  }

  public RootComponent66 getRoot() {
    return root;
  }

}
