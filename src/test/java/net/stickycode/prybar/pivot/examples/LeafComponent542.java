package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent542
    implements PrybarComponent {

  private RootComponent542 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent542.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent542.class, "root"));
  }

  public RootComponent542 getRoot() {
    return root;
  }

}
