package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent798
    implements PrybarComponent {

  private RootComponent798 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent798.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent798.class, "root"));
  }

  public RootComponent798 getRoot() {
    return root;
  }

}
