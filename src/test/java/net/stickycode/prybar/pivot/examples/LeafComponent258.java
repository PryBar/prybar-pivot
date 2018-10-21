package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent258
    implements PrybarComponent {

  private RootComponent258 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent258.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent258.class, "root"));
  }

  public RootComponent258 getRoot() {
    return root;
  }

}
