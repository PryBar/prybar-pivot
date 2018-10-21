package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent60
    implements PrybarComponent {

  private RootComponent60 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent60.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent60.class, "root"));
  }

  public RootComponent60 getRoot() {
    return root;
  }

}
