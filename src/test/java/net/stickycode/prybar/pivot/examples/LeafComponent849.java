package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent849
    implements PrybarComponent {

  private RootComponent849 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent849.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent849.class, "root"));
  }

  public RootComponent849 getRoot() {
    return root;
  }

}
