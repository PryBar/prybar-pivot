package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent30
    implements PrybarComponent {

  private RootComponent30 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent30.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent30.class, "root"));
  }

  public RootComponent30 getRoot() {
    return root;
  }

}
