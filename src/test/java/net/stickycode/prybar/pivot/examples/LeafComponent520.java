package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent520
    implements PrybarComponent {

  private RootComponent520 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent520.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent520.class, "root"));
  }

  public RootComponent520 getRoot() {
    return root;
  }

}
