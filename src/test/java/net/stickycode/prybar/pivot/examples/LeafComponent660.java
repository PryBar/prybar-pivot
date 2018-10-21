package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent660
    implements PrybarComponent {

  private RootComponent660 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent660.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent660.class, "root"));
  }

  public RootComponent660 getRoot() {
    return root;
  }

}
