package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent697
    implements PrybarComponent {

  private RootComponent697 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent697.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent697.class, "root"));
  }

  public RootComponent697 getRoot() {
    return root;
  }

}
