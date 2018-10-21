package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent673
    implements PrybarComponent {

  private RootComponent673 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent673.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent673.class, "root"));
  }

  public RootComponent673 getRoot() {
    return root;
  }

}
