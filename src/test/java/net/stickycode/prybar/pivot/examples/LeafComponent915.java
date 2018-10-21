package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent915
    implements PrybarComponent {

  private RootComponent915 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent915.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent915.class, "root"));
  }

  public RootComponent915 getRoot() {
    return root;
  }

}
