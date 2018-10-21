package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent281
    implements PrybarComponent {

  private RootComponent281 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent281.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent281.class, "root"));
  }

  public RootComponent281 getRoot() {
    return root;
  }

}
