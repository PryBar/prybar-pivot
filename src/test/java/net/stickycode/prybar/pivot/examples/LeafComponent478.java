package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent478
    implements PrybarComponent {

  private RootComponent478 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent478.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent478.class, "root"));
  }

  public RootComponent478 getRoot() {
    return root;
  }

}
