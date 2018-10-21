package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent199
    implements PrybarComponent {

  private RootComponent199 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent199.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent199.class, "root"));
  }

  public RootComponent199 getRoot() {
    return root;
  }

}
