package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent295
    implements PrybarComponent {

  private RootComponent295 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent295.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent295.class, "root"));
  }

  public RootComponent295 getRoot() {
    return root;
  }

}
