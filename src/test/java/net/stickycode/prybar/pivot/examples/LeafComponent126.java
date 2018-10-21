package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent126
    implements PrybarComponent {

  private RootComponent126 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent126.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent126.class, "root"));
  }

  public RootComponent126 getRoot() {
    return root;
  }

}
