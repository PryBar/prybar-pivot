package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent2
    implements PrybarComponent {

  private RootComponent2 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent2.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent2.class, "root"));
  }

  public RootComponent2 getRoot() {
    return root;
  }

}
