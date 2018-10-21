package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent465
    implements PrybarComponent {

  private RootComponent465 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent465.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent465.class, "root"));
  }

  public RootComponent465 getRoot() {
    return root;
  }

}
