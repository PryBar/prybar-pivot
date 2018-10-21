package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent397
    implements PrybarComponent {

  private RootComponent397 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent397.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent397.class, "root"));
  }

  public RootComponent397 getRoot() {
    return root;
  }

}
