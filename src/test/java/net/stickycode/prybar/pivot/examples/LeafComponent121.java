package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent121
    implements PrybarComponent {

  private RootComponent121 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent121.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent121.class, "root"));
  }

  public RootComponent121 getRoot() {
    return root;
  }

}
