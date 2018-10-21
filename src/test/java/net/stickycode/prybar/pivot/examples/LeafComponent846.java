package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent846
    implements PrybarComponent {

  private RootComponent846 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent846.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent846.class, "root"));
  }

  public RootComponent846 getRoot() {
    return root;
  }

}
