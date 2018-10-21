package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent143
    implements PrybarComponent {

  private RootComponent143 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent143.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent143.class, "root"));
  }

  public RootComponent143 getRoot() {
    return root;
  }

}
