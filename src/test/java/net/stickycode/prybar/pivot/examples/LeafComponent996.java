package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent996
    implements PrybarComponent {

  private RootComponent996 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent996.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent996.class, "root"));
  }

  public RootComponent996 getRoot() {
    return root;
  }

}
