package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent240
    implements PrybarComponent {

  private RootComponent240 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent240.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent240.class, "root"));
  }

  public RootComponent240 getRoot() {
    return root;
  }

}
