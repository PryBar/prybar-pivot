package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent308
    implements PrybarComponent {

  private RootComponent308 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent308.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent308.class, "root"));
  }

  public RootComponent308 getRoot() {
    return root;
  }

}
