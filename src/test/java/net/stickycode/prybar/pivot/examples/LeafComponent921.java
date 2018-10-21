package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent921
    implements PrybarComponent {

  private RootComponent921 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent921.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent921.class, "root"));
  }

  public RootComponent921 getRoot() {
    return root;
  }

}
