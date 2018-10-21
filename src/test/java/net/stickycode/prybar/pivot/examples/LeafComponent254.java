package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent254
    implements PrybarComponent {

  private RootComponent254 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent254.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent254.class, "root"));
  }

  public RootComponent254 getRoot() {
    return root;
  }

}
