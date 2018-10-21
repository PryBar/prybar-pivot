package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent987
    implements PrybarComponent {

  private RootComponent987 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent987.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent987.class, "root"));
  }

  public RootComponent987 getRoot() {
    return root;
  }

}
