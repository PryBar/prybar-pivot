package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent661
    implements PrybarComponent {

  private RootComponent661 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent661.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent661.class, "root"));
  }

  public RootComponent661 getRoot() {
    return root;
  }

}
