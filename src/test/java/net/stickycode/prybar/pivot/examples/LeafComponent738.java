package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent738
    implements PrybarComponent {

  private RootComponent738 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent738.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent738.class, "root"));
  }

  public RootComponent738 getRoot() {
    return root;
  }

}
