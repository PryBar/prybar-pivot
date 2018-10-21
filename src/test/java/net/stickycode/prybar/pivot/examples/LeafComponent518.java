package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent518
    implements PrybarComponent {

  private RootComponent518 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent518.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent518.class, "root"));
  }

  public RootComponent518 getRoot() {
    return root;
  }

}
