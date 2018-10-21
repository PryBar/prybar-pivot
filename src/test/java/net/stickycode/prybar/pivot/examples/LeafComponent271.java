package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent271
    implements PrybarComponent {

  private RootComponent271 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent271.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent271.class, "root"));
  }

  public RootComponent271 getRoot() {
    return root;
  }

}
