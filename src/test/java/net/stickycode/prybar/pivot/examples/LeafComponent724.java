package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent724
    implements PrybarComponent {

  private RootComponent724 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent724.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent724.class, "root"));
  }

  public RootComponent724 getRoot() {
    return root;
  }

}
