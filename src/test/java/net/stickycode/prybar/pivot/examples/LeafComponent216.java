package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent216
    implements PrybarComponent {

  private RootComponent216 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent216.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent216.class, "root"));
  }

  public RootComponent216 getRoot() {
    return root;
  }

}
