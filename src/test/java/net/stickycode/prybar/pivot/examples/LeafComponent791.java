package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent791
    implements PrybarComponent {

  private RootComponent791 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent791.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent791.class, "root"));
  }

  public RootComponent791 getRoot() {
    return root;
  }

}
