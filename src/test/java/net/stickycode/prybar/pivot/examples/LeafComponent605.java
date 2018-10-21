package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent605
    implements PrybarComponent {

  private RootComponent605 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent605.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent605.class, "root"));
  }

  public RootComponent605 getRoot() {
    return root;
  }

}
