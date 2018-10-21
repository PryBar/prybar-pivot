package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent752
    implements PrybarComponent {

  private RootComponent752 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent752.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent752.class, "root"));
  }

  public RootComponent752 getRoot() {
    return root;
  }

}
