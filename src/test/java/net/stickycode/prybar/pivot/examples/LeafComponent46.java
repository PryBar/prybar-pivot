package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent46
    implements PrybarComponent {

  private RootComponent46 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent46.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent46.class, "root"));
  }

  public RootComponent46 getRoot() {
    return root;
  }

}
