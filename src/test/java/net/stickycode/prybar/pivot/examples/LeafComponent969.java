package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent969
    implements PrybarComponent {

  private RootComponent969 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent969.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent969.class, "root"));
  }

  public RootComponent969 getRoot() {
    return root;
  }

}
