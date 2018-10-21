package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent980
    implements PrybarComponent {

  private RootComponent980 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent980.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent980.class, "root"));
  }

  public RootComponent980 getRoot() {
    return root;
  }

}
