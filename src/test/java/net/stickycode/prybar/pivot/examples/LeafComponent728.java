package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent728
    implements PrybarComponent {

  private RootComponent728 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent728.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent728.class, "root"));
  }

  public RootComponent728 getRoot() {
    return root;
  }

}
