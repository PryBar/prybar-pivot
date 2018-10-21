package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent879
    implements PrybarComponent {

  private RootComponent879 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent879.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent879.class, "root"));
  }

  public RootComponent879 getRoot() {
    return root;
  }

}
