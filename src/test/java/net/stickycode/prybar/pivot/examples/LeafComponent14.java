package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent14
    implements PrybarComponent {

  private RootComponent14 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent14.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent14.class, "root"));
  }

  public RootComponent14 getRoot() {
    return root;
  }

}
