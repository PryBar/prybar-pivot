package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent467
    implements PrybarComponent {

  private RootComponent467 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent467.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent467.class, "root"));
  }

  public RootComponent467 getRoot() {
    return root;
  }

}
