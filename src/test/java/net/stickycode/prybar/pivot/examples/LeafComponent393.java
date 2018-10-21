package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent393
    implements PrybarComponent {

  private RootComponent393 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent393.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent393.class, "root"));
  }

  public RootComponent393 getRoot() {
    return root;
  }

}
