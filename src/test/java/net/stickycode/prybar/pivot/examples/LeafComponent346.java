package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent346
    implements PrybarComponent {

  private RootComponent346 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent346.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent346.class, "root"));
  }

  public RootComponent346 getRoot() {
    return root;
  }

}
