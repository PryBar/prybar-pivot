package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent979
    implements PrybarComponent {

  private RootComponent979 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent979.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent979.class, "root"));
  }

  public RootComponent979 getRoot() {
    return root;
  }

}
